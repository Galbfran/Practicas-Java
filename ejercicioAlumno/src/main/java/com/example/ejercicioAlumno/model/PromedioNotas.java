package com.example.ejercicioAlumno.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PromedioNotas {
    private double notaUno;
    private double notaDos;
    private double notaTres;

    public double Promedio(){
        double prom = (this.notaUno + this.notaDos + this.notaTres)/3;
        return  prom;
    }
    public PromedioNotas(){}

    public PromedioNotas(double notaUno, double notaDos, double notaTres) {
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }



}
