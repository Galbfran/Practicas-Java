package com.example.ejercicioEstudiante.controller;


import com.example.ejercicioEstudiante.model.Curso;
import com.example.ejercicioEstudiante.service.CursoService;
import com.example.ejercicioEstudiante.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService interCurso;

    @GetMapping("/curso/traer")
    public List<Curso> getCurso(){
        return interCurso.getCursos();
    }

    @GetMapping("/curso/traer/{id}")
    public Curso getCursoId (@PathVariable Long id){
        Curso curso = interCurso.findCurso(id);
        return  curso;

    }


    @PostMapping("/curso/crear")
    public String createCurso (@RequestBody Curso curso){
        interCurso.saveCurso(curso);
        return "El curso fue dado de alta con exito.";
    }


    @DeleteMapping("/curso/borrar/{id}")
    public String deleteCurso(@PathVariable Long id){
        interCurso.deleteCurso(id);
        return "El curso fue borrado con exito.";
    }

    @PutMapping("/curso/editar")
    public Curso editCurso(@RequestBody  Curso curso){
        interCurso.saveCurso(curso);
        return  interCurso.findCurso(curso.getId_curso());
    }


}
