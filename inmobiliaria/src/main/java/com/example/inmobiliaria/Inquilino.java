package com.example.inmobiliaria;

public class Inquilino {
    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profecion;

    public Inquilino() {
    }

    public Inquilino(Long id_inquilino, String dni, String nombre, String apellido, String profecion) {
        this.id_inquilino = id_inquilino;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profecion = profecion;
    }

    public Long getId_inquilino() {
        return id_inquilino;
    }

    public void setId_inquilino(Long id_inquilino) {
        this.id_inquilino = id_inquilino;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }
}
