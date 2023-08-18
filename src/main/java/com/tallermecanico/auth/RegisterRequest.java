package com.tallermecanico.auth;

import com.tallermecanico.models.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String email;
    String username;
    String password;
}
