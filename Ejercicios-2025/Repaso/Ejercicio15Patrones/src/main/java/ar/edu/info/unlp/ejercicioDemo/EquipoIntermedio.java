package ar.edu.info.unlp.ejercicioDemo;

public class EquipoIntermedio extends EquipoBuilder{

    public EquipoIntermedio(Catalogo c) {
        super(c);
    }

    public void crearProcesador() {
        this.equipo.add(this.catalogo.getComponente("Procesador Intermedio"));
    }


    public void crearDisco() {
        this.equipo.add(this.catalogo.getComponente("SSD 500 GB"));
    }


    public void crearMemoriaRam() {
        this.equipo.add(this.catalogo.getComponente("16 GB"));
    }


    public void crearTarjetaGrafica() {
        this.equipo.add(this.catalogo.getComponente("GTX 1650"));
    }


    public void crearGabinete() {
        this.equipo.add(this.catalogo.getComponente("Gabinete Intermedio"));
        this.equipo.add(this.catalogo.getComponente("Fuente 800 w"));
    }
}
