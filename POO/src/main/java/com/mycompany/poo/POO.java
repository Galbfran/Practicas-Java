package com.mycompany.poo;

public class POO {

    public static void main(String[] args) {
        Alumno aluUno = new Alumno(1 , "franco" , "galbiati");
        
        Alumno aluDos = new Alumno ();
        
        System.out.println(aluUno.getNombreCompleto() + aluUno.getId());
        System.out.println( aluDos + " alumno dos");
        
        aluDos.setNombre("pepe");
        aluDos.setApellido("grillo");
        aluDos.setId(10);
        
        System.out.println(aluDos.getNombreCompleto() + "  . con id: " + aluDos.getId());
        
    }
}
