package com.example.ejercicioAlumno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    @GetMapping("/promedio")
    public  double CalcularPromedio(@RequestParam("numUno") double numUno , @RequestParam("numDos") double numDos,@RequestParam("numTres") double numTres){
        return (numUno + numDos + numTres)/3;
    }

}
