package ar.edu.unlp.info.oo2.biblioteca;

public class Planta extends Empleado{
    private int aniosAntiguedad;

    public Planta(Boolean casado, int cantHijos, int aniosAnt) {
        super(casado, cantHijos);
        this.aniosAntiguedad = aniosAnt;
    }

    @Override
    public double basico() {
        return 50000;
    }

    @Override
    public double descuento() {
        return (this.basico() * 0.13) + (this.adicional() * 0.05);
    }

    @Override
    public double adicional() {
        if (this.casado)
            return 5000 + (this.cantHijos * 2000) + (this.aniosAntiguedad * 2000);
        return (this.cantHijos * 2000) + (this.aniosAntiguedad * 2000);
    }
}
