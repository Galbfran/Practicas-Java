package com.example.arquitecturaCapas.repository;

import com.example.arquitecturaCapas.model.Posteo;

import java.util.List;

public interface IPosteoRepository {
    public List<Posteo> traerTodos();
}
