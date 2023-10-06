/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioplantas;

/**
 *
 * @author HP
 */
public class Arbol extends Planta{
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;
    
    public Arbol(){
    }    

    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    @Override
    public void decirLoQueSoy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Arbol{" + "variedad=" + variedad + ", tipoTronco=" + tipoTronco + ", radioTronco=" + radioTronco + ", color=" + color + ", tipoHojas=" + tipoHojas + '}';
    }

  
    
    
    
    
}
