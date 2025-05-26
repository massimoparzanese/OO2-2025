package ar.edu.info.unlp.ejercicioDemo;

public class DirectorPresupuestario {

    public Equipo crearEquipo(EquipoBuilder e){
        e.crearEquipo();
        e.crearProcesador();
        e.crearDisco();
        e.crearMemoriaRam();
        e.crearTarjetaGrafica();
        e.crearGabinete();
        return e.finalizarEquipo();
    }

    public Presupuesto crearPresupuesto(String nombre, EquipoBuilder e){
        return new Presupuesto(nombre, this.crearEquipo(e));
    }
}
