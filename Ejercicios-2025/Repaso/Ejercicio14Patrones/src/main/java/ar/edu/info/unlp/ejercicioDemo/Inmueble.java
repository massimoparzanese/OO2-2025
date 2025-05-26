package ar.edu.info.unlp.ejercicioDemo;

import java.time.temporal.ChronoUnit;

public class Inmueble implements Prenda{

    private String direccion;
    private double superficie;
    private double costo;

    public Inmueble(String direccion, double superficie, double costo) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.costo = costo;
    }

    public double calcularCoeficienteLiquidez(){
        return 0.2;
    }

    public double calcularValorPrendario(){
        return this.costo() * this.calcularCoeficienteLiquidez();
    }
    public double costo(){
        return this.superficie * this.costo;
    }

    public void add(Prenda p){}

    public void remove(Prenda p){}
}
