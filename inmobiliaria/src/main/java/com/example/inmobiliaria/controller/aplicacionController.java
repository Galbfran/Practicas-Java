package com.example.inmobiliaria.controller;

import com.example.inmobiliaria.Inquilino;
import com.example.inmobiliaria.Propiedad;
import com.example.inmobiliaria.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    @GetMapping("/propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        Propiedad prop = new Propiedad(123L, "casa", "peron 586" , 200.2 , 4000.0);
        Inquilino inqui = new Inquilino(1L , "132456" , "franco" , "glabiati", "programador");

        PropiedadDTO propiDTO = new PropiedadDTO();

        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());

        return propiDTO;





    }
}
