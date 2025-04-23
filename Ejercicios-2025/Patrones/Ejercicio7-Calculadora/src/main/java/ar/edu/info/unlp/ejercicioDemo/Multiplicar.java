package ar.edu.info.unlp.ejercicioDemo;

public class Multiplicar extends Operacion{

    public void operar(Calculadora c, double unValor) {
         c.setValorAcumulado(String.valueOf(Double.parseDouble(c.getValorAcumulado()) * unValor));
    }
}
