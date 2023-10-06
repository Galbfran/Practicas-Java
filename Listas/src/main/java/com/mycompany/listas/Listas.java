/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Listas {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();
        
        //agrego cuatro elementos
        
        lista.add(new Persona(1 , "Franco" , 30));
        lista.add(new Persona(2 , "pepe" , 31));
        lista.add(new Persona(3 , "grillo" , 32));
        lista.add(new Persona(4 , "bri" , 33));
        
        
        //agregar al principio
        
        lista.add(0, new Persona(5 , "pepegillo" , 33));
    
      
        
        // foreach por cada uno
        
        for (Persona perso: lista){
            System.out.println("Prueba forEach : " + perso.getNombre() + perso.getEdad());
        }
        
        
        
        
        
    }
}
