package com.example.arquitecturaCapas.repository;

import com.example.arquitecturaCapas.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepositori implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L , "probando " , "franco"));
        listaPosteos.add(new Posteo(2L , "probando 2" , "galbiati"));


        return listaPosteos;



    }
}
