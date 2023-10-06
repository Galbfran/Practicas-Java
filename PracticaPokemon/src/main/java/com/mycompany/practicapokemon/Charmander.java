/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapokemon;

/**
 *
 * @author HP
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Placaje. Charmander");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Araniazo. Charmander");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Ataque Mordico. Charmander");
    }

    @Override
    public void atacarLanzaLLamas() {
         System.out.println("Ataque LamzaLammas. Charmander");
    }

    @Override
    public void atacarPunioTrueno() {
         System.out.println("Ataque Araniazo. Charmander");
    }
    
}
