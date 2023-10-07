/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaejemplo.Persistencia;

import com.mycompany.jpaejemplo.Logica.Alumno;

/**
 *
 * @author HP
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }
    
}
