package ar.edu.info.unlp.ejercicioDemo;

public class EquipoGamer extends EquipoBuilder{


    public EquipoGamer(Catalogo c) {
        super(c);
    }

    public void crearProcesador() {
        this.equipo.add(this.catalogo.getComponente("Procesador Gamer"));
        this.equipo.add(this.catalogo.getComponente("Pad térmico"));
        this.equipo.add(this.catalogo.getComponente("Cooler Gamer"));
    }


    public void crearDisco() {
        this.equipo.add(this.catalogo.getComponente("SSD 500 GB"));
        this.equipo.add(this.catalogo.getComponente("SSD 1 TB"));
    }


    public void crearMemoriaRam() {
        this.equipo.add(this.catalogo.getComponente("32 GB"));
        this.equipo.add(this.catalogo.getComponente("32 GB"));
    }


    public void crearTarjetaGrafica() {
        this.equipo.add(this.catalogo.getComponente("RTX 4090"));
    }


    public void crearGabinete() {
        this.equipo.add(this.catalogo.getComponente("Gabinete gamer"));
        this.equipo.add(this.catalogo.getComponente("Fuente " + (this.equipo.calcularConsumo() * 1.50) + " w"));
    }
}
