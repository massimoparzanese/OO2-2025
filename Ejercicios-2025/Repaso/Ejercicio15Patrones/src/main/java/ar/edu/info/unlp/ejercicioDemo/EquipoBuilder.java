package ar.edu.info.unlp.ejercicioDemo;

public abstract class EquipoBuilder {

    protected Catalogo catalogo;
    protected Equipo equipo;
    public EquipoBuilder(Catalogo c){
        this.catalogo = c;
    }

    public void crearEquipo(){
        this.equipo = new Equipo();
    }

    public abstract void crearProcesador();
    public abstract void crearDisco();
    public abstract void crearMemoriaRam();
    public abstract void crearTarjetaGrafica();
    public abstract void crearGabinete();

    public Equipo finalizarEquipo(){
        return this.equipo;
    }

}
