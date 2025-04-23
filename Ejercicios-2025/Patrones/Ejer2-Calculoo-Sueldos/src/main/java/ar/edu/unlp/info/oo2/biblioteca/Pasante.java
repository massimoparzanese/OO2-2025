package ar.edu.unlp.info.oo2.biblioteca;

public class Pasante extends Empleado{

    public Pasante(Boolean casado, int cantHijos) {
        super(casado, cantHijos);
    }

    @Override
    public double basico() {
        return 20000;
    }

    @Override
    public double descuento() {
        return (this.basico() * 0.13) + (this.adicional() * 0.05);
    }

    @Override
    public double adicional() {
        return 2000;
    }
}
