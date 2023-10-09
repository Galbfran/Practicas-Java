package com.example.arquitecturaCapas.service;

import com.example.arquitecturaCapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Override
    public void crearPersona(Persona per) {
        System.out.println("persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //debe devolverlista de personas
        return null;
    }
}
