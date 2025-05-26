package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada implements Prenda{

    private List<Prenda> predas;

    public PrendaCombinada(){
        this.predas = new ArrayList<Prenda>();
    }

    public double calcularCoeficienteLiquidez(){
        return 0.5;
    }

    public double calcularValorPrendario(){

        return this.costo() * this.calcularCoeficienteLiquidez();
    }

    public double costo(){
        return this.predas.stream().mapToDouble(p -> p.costo()).sum();
    }

    public void add(Prenda p){
        this.predas.add(p);
    }

    public void remove(Prenda p){
        this.predas.remove(p);
    }
}
