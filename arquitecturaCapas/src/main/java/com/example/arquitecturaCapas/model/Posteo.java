package com.example.arquitecturaCapas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Posteo {
    private Long id;
    private String titulol;
    private String autor;

    public Posteo(Long id, String titulol, String autor) {
        this.id = id;
        this.titulol = titulol;
        this.autor = autor;
    }

    public Posteo() {
    }
}
