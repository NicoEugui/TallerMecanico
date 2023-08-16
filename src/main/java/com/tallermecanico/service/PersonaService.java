package com.tallermecanico.service;

import com.tallermecanico.models.Persona;
import com.tallermecanico.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona crearPersona(Persona persona) {

        return personaRepository.save(persona);
    }

    public void borrarPersona(Long id) {

        personaRepository.deleteById(id);
    }

    public List<Persona> listarPersonas() {

        return personaRepository.findAll();
    }

    public Persona buscarPersonaPorId(Long id) {

        return personaRepository.findById(id).orElse(null);
    }

    public Persona modificarPersona(Persona persona) {
        return personaRepository.save(persona);

    }
}
