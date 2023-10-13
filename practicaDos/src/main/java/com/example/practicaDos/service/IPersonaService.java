package com.example.practicaDos.service;

import com.example.practicaDos.model.Persona;

import java.util.List;


public interface IPersonaService {

    //metodo traer todas las personas
    public List<Persona> getPersonas();

    //metodo dar de alta
    public void savePersona (Persona perso);

    //metodo para borrar una persona
    public void deletePersona (Long id);

    //metodo encotrar una  persona
    public Persona findPersona (Long id);

    //metodo edit
    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);



}
