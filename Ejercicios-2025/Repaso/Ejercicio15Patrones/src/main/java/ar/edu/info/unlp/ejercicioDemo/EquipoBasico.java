package ar.edu.info.unlp.ejercicioDemo;

public class EquipoBasico extends EquipoBuilder{
    public EquipoBasico(Catalogo c) {
        super(c);
    }

    public void crearProcesador() {
        this.equipo.add(this.catalogo.getComponente("Procesador Básico"));
    }


    public void crearDisco() {
        this.equipo.add(this.catalogo.getComponente("HDD 500 GB"));
    }


    public void crearMemoriaRam() {
        this.equipo.add(this.catalogo.getComponente("8 GB"));
    }


    public void crearTarjetaGrafica() {}


    public void crearGabinete() {
        this.equipo.add(this.catalogo.getComponente("Gabinete Estándar"));
    }
}
