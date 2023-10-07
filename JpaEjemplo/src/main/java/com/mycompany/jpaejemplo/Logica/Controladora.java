/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaejemplo.Logica;

import com.mycompany.jpaejemplo.Persistencia.ControladoraPersistencia;

/**
 *
 * @author HP
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
}
