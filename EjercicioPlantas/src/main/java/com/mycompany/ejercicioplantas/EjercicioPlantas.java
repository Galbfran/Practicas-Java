/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioplantas;

/**
 *
 * @author HP
 */
public class EjercicioPlantas {

    public static void main(String[] args) {
        Arbol arbolito = new Arbol(
                "variedad",
                "tronco",
                10,
                "marron",
                "hojas",
                "arbolito",
                1,
                true,
                "verano");
        
        
        Flor florcita = new Flor(
                "rosa",
                10,
                "rojo",
                "variedad",
                "verano",
                "florcita",
                2,
                true,
                "primavera");
        
        System.out.println(florcita);
        System.out.println(arbolito);
        
    }
}
