/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapokemon;

/**
 *
 * @author HP
 */
public class Bulbasor extends Pokemon implements IPlanta{

    public Bulbasor() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje. Bulbasor");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo. Bulbasor");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Mordizco. Bulbasor");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Ataque Dranaje. Bulbasor");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Ataque Pasalizar. Bulbasor");
    }
    
}
