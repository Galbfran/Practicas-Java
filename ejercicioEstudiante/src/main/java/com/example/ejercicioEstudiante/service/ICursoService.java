package com.example.ejercicioEstudiante.service;

import com.example.ejercicioEstudiante.model.Curso;

import java.util.List;

public interface ICursoService {

    public List<Curso> getCursos();

    public void saveCurso (Curso curso);

    public void deleteCurso (Long id);

    public Curso findCurso(Long id);

    public void editCurso(Curso curso);


}
