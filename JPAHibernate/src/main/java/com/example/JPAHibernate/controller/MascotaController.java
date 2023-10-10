package com.example.JPAHibernate.controller;

import com.example.JPAHibernate.model.Mascota;
import com.example.JPAHibernate.model.Persona;
import com.example.JPAHibernate.service.IMascotasService;
import com.example.JPAHibernate.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private IMascotasService mascoServ;

    @GetMapping("/mascota/traer")
    public List<Mascota> getMascota(){
        return mascoServ.getMascotas();
    }

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/mascota/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoServ.deleteMascota(id);
        return "La mascota fue borrada con correctamente";
    }



}
