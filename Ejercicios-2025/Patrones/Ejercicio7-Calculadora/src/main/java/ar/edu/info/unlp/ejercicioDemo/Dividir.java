package ar.edu.info.unlp.ejercicioDemo;

public class Dividir extends Operacion{



    public void operar(Calculadora c, double unValor) {
        if (unValor != 0)
            c.setValorAcumulado(String.valueOf(Double.parseDouble(c.getValorAcumulado()) / unValor));
        else
            c.setState(new Error());


    }
}
