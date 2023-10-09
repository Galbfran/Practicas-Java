package com.example.arquitecturaCapas.controller;

import com.example.arquitecturaCapas.model.Posteo;
import com.example.arquitecturaCapas.repository.IPosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class aplicacionController {

    @Autowired
    IPosteoRepository repo;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return  repo.traerTodos();
    }




}
