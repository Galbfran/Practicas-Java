package com.example.ejercicioEstudiante.service;

import com.example.ejercicioEstudiante.model.Curso;
import com.example.ejercicioEstudiante.model.Tema;

import java.util.List;

public interface ITemaService {

    public List<Tema> getTema();

    public void saveTema (Tema tema);

    public void deleteTema (Long id);

    public Tema findTema(Long id);

    public void editTema(Tema tema);

}
