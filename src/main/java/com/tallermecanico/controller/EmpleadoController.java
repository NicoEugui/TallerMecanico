package com.tallermecanico.controller;

import com.tallermecanico.models.Empleado;
import com.tallermecanico.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/login")
    public Empleado login (@RequestBody Empleado empleado) {
        return empleadoService.login(empleado.getNombreUsuario(), empleado.getClave());
    }
}
