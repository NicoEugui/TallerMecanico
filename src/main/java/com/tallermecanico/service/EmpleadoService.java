package com.tallermecanico.service;

import com.tallermecanico.models.Empleado;
import com.tallermecanico.models.Persona;
import com.tallermecanico.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public Empleado login(String nombreUsuario, String clave) {
        return empleadoRepository.findByNombreUsuarioAndClave(nombreUsuario, clave);
    }
}
