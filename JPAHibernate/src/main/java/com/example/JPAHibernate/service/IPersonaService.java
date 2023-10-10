package com.example.JPAHibernate.service;

import com.example.JPAHibernate.model.Persona;

import java.util.List;

public interface IPersonaService {
    //metodo [ara traer todas las personas
    public List<Persona> getPersonas();
    //metodo para dar de alta una persona
    public void savePersona (Persona perso);
    //metodo borrar
    public void deletePersona (Long id);

    //metodo encontrar una persona
    public Persona findPersona(Long id);

    //edicion
    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);

    void editPersona(Persona per);
}
