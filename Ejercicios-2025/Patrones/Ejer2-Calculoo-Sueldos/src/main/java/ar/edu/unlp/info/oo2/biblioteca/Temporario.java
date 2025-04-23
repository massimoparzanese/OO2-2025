package ar.edu.unlp.info.oo2.biblioteca;

public class Temporario extends Empleado{

    private int horasTrabajadas;

    public Temporario(Boolean casado, int cantHijos, int horasTrabajadas) {
        super(casado, cantHijos);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double basico() {
        return 20000 + (this.horasTrabajadas * 300);
    }

    @Override
    public double descuento() {
        return (this.basico() * 0.13) + (this.adicional() * 0.05);
    }

    @Override
    public double adicional() {

        if (this.casado)
            return 5000 + (this.cantHijos * 2000) ;
        return this.cantHijos * 2000;
    }
}
