/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciovideojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EjercicioVideoJuegos {

    public static void main(String[] args) {
        List <Videojuegos> catalogo = new ArrayList<Videojuegos>();
        
        catalogo.add(new Videojuegos(0, "Dragon ball", "Play", 2, "Pelea"));
        catalogo.add(new Videojuegos(1, "football", "Play", 4, "Football"));
        catalogo.add(new Videojuegos(2, "Tenis", "Pc", 2, "Tenis"));
        catalogo.add(new Videojuegos(3, "Rapidos y Furiosos", "Xbox", 2, "Carreras"));
        
        for (Videojuegos juego : catalogo) {
            System.out.println(juego.toString());
        }
        System.out.println("---------------------------------------------");
        catalogo.get(1 ).setCategoria("Deportes");
        catalogo.get(2).setCategoria("Depostes");
        
        
        
        
        //mostrar modidificaiones
          for (Videojuegos juego : catalogo) {
            juego.getCaracteristicas();
        }
        // recorrer y mostrar solo los objetos play
        System.out.println("---------------------------------------------");
        
            for (Videojuegos juego : catalogo) {
            if ("Play".equals(juego.getConsola())){
                juego.getCaracteristicas();
            }
        }
          
        
    }
}
