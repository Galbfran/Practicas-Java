/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones;

/**
 *
 * @author HP
 */
public class Excepciones {

    public static void main(String[] args) {
        try{
            int resultado = 3/0;
        
        }
        catch(Exception e){
            System.out.println("No se puede dividir por 0");
        }
        
        
        int edades [] = {15 , 12 , 23 , 60};
        try{
            System.out.println("La edad de la posicion cuatro es:" + edades [4]);
        }
        catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
        
        
    }
}
