package ar.edu.unlp.info.oo2.biblioteca;

public abstract class Empleado {

    protected Boolean casado;
    protected int cantHijos;

    public Empleado(Boolean casado, int cantHijos){
        this.casado = casado;
        this.cantHijos = cantHijos;
    }

    public double sueldo(){

        return this.basico() + this.adicional() - this.descuento();

    }

    public abstract double basico();

    public abstract double descuento();

    public abstract double adicional();
}
