package com.mycompany.jpaejemplo;

import com.mycompany.jpaejemplo.Logica.Alumno;
import com.mycompany.jpaejemplo.Logica.Controladora;
import java.util.Date;


public class JpaEjemplo {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Alumno alu = new Alumno(1, "franco", "galbiati", new Date());
        
        control.crearAlumno(alu);
        
        
    }

   
}
