package com.tallermecanico.auth;

import com.tallermecanico.jwt.JwtService;
import com.tallermecanico.models.Empleado;
import com.tallermecanico.models.Persona;
import com.tallermecanico.models.Rol;
import com.tallermecanico.repository.EmpleadoRepository;
import com.tallermecanico.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final EmpleadoRepository empleadoRepository;
    private final PersonaRepository personaRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user= empleadoRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }

    public AuthResponse register(RegisterRequest request) {
        // Crear una instancia de Persona y establecer sus campos
        Persona persona = Persona.builder()
                .nombre(request.getNombre())
                .apellido(request.getApellido())
                .direccion(request.getDireccion())
                .telefono(request.getTelefono())
                .email(request.getEmail())
                .build();

        // Guardar la instancia de Persona en la base de datos
        Persona savedPersona = personaRepository.save(persona);

        // Crear una instancia de Empleado y asignar la instancia de Persona guardada
        Empleado empleado = Empleado.builder()
                .persona(savedPersona)  // Asignar la instancia de Persona guardada
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .rol(Rol.ADMINISTRATIVO)
                .build();

        // Guardar el Empleado en la base de datos
        empleadoRepository.save(empleado);

        return AuthResponse.builder()
                .token(jwtService.getToken(empleado))
                .build();
    }
}
