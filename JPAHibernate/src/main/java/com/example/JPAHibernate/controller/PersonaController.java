package com.example.JPAHibernate.controller;

import com.example.JPAHibernate.model.Persona;
import com.example.JPAHibernate.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService persoServ;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return persoServ.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deleteParsona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "La persona fue borrada con correctamente";
    }

    @PutMapping("/persona/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false,name = "id") Long nuevaId,
                               @RequestParam(required = false,name = "nombre") String nuevoNombre,
                               @RequestParam(required = false,name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad){
        persoServ.editPersona(id_original , nuevaId,nuevoNombre ,nuevoApellido , nuevaEdad);
        Persona perso = persoServ.findPersona(nuevaId);
        return perso;

    }



}
