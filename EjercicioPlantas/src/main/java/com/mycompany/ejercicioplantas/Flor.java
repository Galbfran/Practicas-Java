/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioplantas;

/**
 *
 * @author HP
 */
public class Flor extends Planta{
    private String colorPetalos;
    private double cantPromPetalos;
    private String colorPistilo;
    private String variadadFlor;
    private String estacionFlorece;
    
    public Flor(){
    }    

    public Flor(String colorPetalos, double cantPromPetalos, String colorPistilo, String variadadFlor, String estacionFlorece, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromPetalos = cantPromPetalos;
        this.colorPistilo = colorPistilo;
        this.variadadFlor = variadadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getCantPromPetalos() {
        return cantPromPetalos;
    }

    public void setCantPromPetalos(double cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariadadFlor() {
        return variadadFlor;
    }

    public void setVariadadFlor(String variadadFlor) {
        this.variadadFlor = variadadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public String toString() {
        return "Flor{" + "colorPetalos=" + colorPetalos + ", cantPromPetalos=" + cantPromPetalos + ", colorPistilo=" + colorPistilo + ", variadadFlor=" + variadadFlor + ", estacionFlorece=" + estacionFlorece + '}';
    }
    
    
    
    
    @Override
    public void decirLoQueSoy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
