package com.example.practicaDos.controller;

import com.example.practicaDos.model.Persona;
import com.example.practicaDos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/persona/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }

    @PostMapping("/persona/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada con exito";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue borrada con exito";
    }

    @PutMapping("/persona/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false,name = "id") Long nuevaId,
                               @RequestParam(required = false,name = "nombre") String nuevoNombre,
                               @RequestParam(required = false,name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad){
        interPersona.editPersona(id_original , nuevaId,nuevoNombre ,nuevoApellido , nuevaEdad);
        Persona perso = interPersona.findPersona(nuevaId);
        return perso;

    }








}
