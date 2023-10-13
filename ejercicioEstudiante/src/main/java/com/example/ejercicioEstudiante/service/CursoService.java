package com.example.ejercicioEstudiante.service;

import com.example.ejercicioEstudiante.model.Curso;
import com.example.ejercicioEstudiante.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService  implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepository.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        return curso;
    }

    @Override
    public void editCurso(Curso curso) {
        cursoRepository.save(curso);
    }
}
