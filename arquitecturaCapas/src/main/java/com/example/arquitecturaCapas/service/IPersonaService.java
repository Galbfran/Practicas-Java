package com.example.arquitecturaCapas.service;

import com.example.arquitecturaCapas.model.Persona;

import java.util.List;

public interface IPersonaService {

    public void crearPersona (Persona per);
    public List<Persona> traerPersonas();


}
