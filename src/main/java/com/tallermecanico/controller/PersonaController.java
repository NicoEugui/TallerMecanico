package com.tallermecanico.controller;

import com.tallermecanico.models.Persona;
import com.tallermecanico.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona() {
        return personaService.listarPersonas();
    }

    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaService.crearPersona(persona);
    }

    @PutMapping("/persona")
    @ResponseBody
    public Persona modificarPersona(@RequestBody Persona persona) {
        return personaService.modificarPersona(persona);
    }
}
