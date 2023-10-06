/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesabstractas;

/**
 *
 * @author HP
 */
public class Cuadrado implements Figura , Rotable , Dibujable{
    
    private double lado;
    
    public Cuadrado(){
    }

    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    

    @Override  //sobre escritura
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void rotar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
    
}
