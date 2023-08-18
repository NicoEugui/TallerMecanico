package com.tallermecanico.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DemoController {
    // Controlador para la ruta POST "/api/v1/demo"
    @PostMapping(value = "demo")
    public String welcome() {
        return "Bienvenido desde el punto de acceso seguro";
    }
}
