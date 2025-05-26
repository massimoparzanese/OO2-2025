package ar.edu.info.unlp.ejercicioDemo;

public interface Prenda {

    public void add(Prenda p);
    public void remove(Prenda p);
    public double calcularCoeficienteLiquidez();
    public double calcularValorPrendario();
    public double costo();
}
