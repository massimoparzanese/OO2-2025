package ar.edu.info.unlp.ejercicioDemo;

public class Initial implements State{

    public void operar(Calculadora c, double unValor) {
        c.setValorAcumulado(Double.toString(unValor));
    }


    public void mas(Calculadora c) {
        c.setState(new Sumando());
    }


    public void menos(Calculadora c) {
        c.setState(new Restar());
    }


    public void por(Calculadora c) {
        c.setState(new Multiplicar());
    }


    public void dividir(Calculadora c) {
        c.setState(new Dividir());
    }


    public String getResultado(Calculadora c) {
        return c.getValorAcumulado();
    }
}
