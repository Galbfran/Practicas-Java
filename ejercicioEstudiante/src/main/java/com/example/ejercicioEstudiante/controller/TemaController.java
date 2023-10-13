package com.example.ejercicioEstudiante.controller;


import com.example.ejercicioEstudiante.model.Tema;

import com.example.ejercicioEstudiante.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {
    @Autowired
    private ITemaService temaService;

    @GetMapping("/tema/traer")
    public List<Tema> getCurso(){
        return temaService.getTema();
    }

    @GetMapping("/tema/traer/{id}")
    public Tema getCursoId (@PathVariable Long id){
        Tema tema = temaService.findTema(id);
        return  tema;

    }


    @PostMapping("/tema/crear")
    public String createCurso (@RequestBody Tema tema){
        temaService.saveTema(tema);
        return "El tema fue dado de alta con exito.";
    }


    @DeleteMapping("/tema/borrar/{id}")
    public String deleteCurso(@PathVariable Long id){
        temaService.deleteTema(id);
        return "El tema fue borrado con exito.";
    }

    @PutMapping("/tema/editar")
    public Tema editCurso(@RequestBody  Tema tema){
        temaService.saveTema(tema);
        return  temaService.findTema(tema.getId_tema());
    }




}
