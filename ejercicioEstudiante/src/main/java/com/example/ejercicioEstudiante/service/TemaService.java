package com.example.ejercicioEstudiante.service;

import com.example.ejercicioEstudiante.model.Curso;
import com.example.ejercicioEstudiante.model.Tema;
import com.example.ejercicioEstudiante.repository.ICursoRepository;
import com.example.ejercicioEstudiante.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepository;

    @Override
    public List<Tema> getTema() {
        List<Tema> listaTemas = temaRepository.findAll();
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepository.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepository.deleteById(id);
    }

    @Override
    public Tema findTema(Long id) {
        Tema tema = temaRepository.findById(id).orElse(null);
        return tema;
    }

    @Override
    public void editTema(Tema tema) {
        temaRepository.save(tema);
    }
}
