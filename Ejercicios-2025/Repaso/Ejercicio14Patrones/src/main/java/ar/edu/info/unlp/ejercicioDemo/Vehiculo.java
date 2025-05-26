package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo implements Prenda{
    private int modelo;
    private double costo;
    private int km;

    public Vehiculo(int model, double costo, int km){
        this.modelo = model;
        this.costo = costo;
        this.km = km;
    }
    public double calcularCoeficienteLiquidez(){
        return 0.7;
    }

    public double calcularValorPrendario(){
        return this.costo() * this.calcularCoeficienteLiquidez();
    }
    public double costo(){
        return this.costo * (0.10 * (LocalDate.now().getYear() - this.modelo));
    }

    public void add(Prenda p){}

    public void remove(Prenda p){}
}
