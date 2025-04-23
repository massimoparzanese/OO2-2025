package ar.edu.info.unlp.ejercicioDemo;

public abstract class Operacion implements State{


    public void mas(Calculadora c){
        c.setState(new Error());
    }
    public void menos(Calculadora c){
        c.setState(new Error());
    }
    public void por(Calculadora c){
        c.setState(new Error());
    }
    public void dividir(Calculadora c){
        c.setState(new Error());
    }
    public String getResultado(Calculadora c){
        c.setState(new Error());
        return "Error";
    }
}
