package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Prenda{
    private LocalDate comienzo;
    private LocalDate fin;
    private double costo;

    public Alquiler(LocalDate comienzo, LocalDate fin, double costo) {
        this.comienzo = comienzo;
        this.fin = fin;
        this.costo = costo;
    }

    public double calcularCoeficienteLiquidez(){
        return 0.9;
    }

    public double calcularValorPrendario(){
        return this.costo() * this.calcularCoeficienteLiquidez();
    }
    public double costo(){
        return ChronoUnit.MONTHS.between(this.comienzo,this.fin) * this.costo;
    }

    public void add(Prenda p){}

    public void remove(Prenda p){}
}
