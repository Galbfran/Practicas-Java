/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciovideojuegos;

/**
 *
 * @author HP
 */
public class Videojuegos {
    int codigo;
    String titulo;
    String consola;
    int CantidadJugadores; 
    String categoria;
    
    public Videojuegos(){
    }

    public Videojuegos(int codigo, String titulo, String consola, int CantidadJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.CantidadJugadores = CantidadJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return CantidadJugadores;
    }

    public void setCantidadJugadores(int CantidadJugadores) {
        this.CantidadJugadores = CantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void getCaracteristicas(){
        System.out.println("El juego es "+ getTitulo() + ". Para la consola: " + getConsola() + " . La cantidad de jugadores es:" + getCantidadJugadores() + " .Categoria: " + getCategoria() );
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", CantidadJugadores=" + CantidadJugadores + ", categoria=" + categoria + '}';
    }
    
    
}
