package com.mycompany.poo;


public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    

    public String getApellido() {
        return apellido;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombreCompleto(){
        return "Mi nombre es: " + nombre + ". Apellido:" + apellido ;
    }
    
    public void saberAprobo (double calificacion){
        if (calificacion >= 6 ){
            System.out.println("Aprobe la materia");
        } else {
            System.out.println("No aprobe la materia");
        }
    }
    
    
    
}
