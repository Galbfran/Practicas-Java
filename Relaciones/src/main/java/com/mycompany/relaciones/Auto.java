/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relaciones;

import java.util.List;

/**
 *
 * @author HP
 */
public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    
    private List<Propietario> listaPropietario;
    
    public Auto(){
    }

    public Auto(Long id, String marca, String modelo , List<Propietario>  listaPropietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }
    
    
    
    
}
