package ar.edu.info.unlp.ejercicioDemo;

public class Error implements State{

    public String operar(Calculadora c, double unValor) {
        return "Error";
    }


    public void mas(Calculadora c) {}


    public void menos(Calculadora c) {}


    public void por(Calculadora c) {}


    public void dividir(Calculadora c) {}


    public String getResultado(Calculadora c) {
        return "Error";
    }
}
