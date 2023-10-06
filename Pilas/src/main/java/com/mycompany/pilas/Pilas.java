/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilas;

import java.util.Stack;

/**
 *
 * @author HP
 */
public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Pila vacia:" + pila);
        System.out.println("Esta vacia?"+ pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        
        //recorrido
        for (Integer unidad : pila) {
            System.out.println("el elemento:" + unidad);
        }
        
        //mostrar
        System.out.println("Pila vacia:" + pila);
        System.out.println("Esta vacia?"+ pila.isEmpty());
        
        // eliminar el ultimo rergitro que entro
        
        pila.pop();
        
        System.out.println(pila);
        System.out.println(pila.peek());
    }
}
