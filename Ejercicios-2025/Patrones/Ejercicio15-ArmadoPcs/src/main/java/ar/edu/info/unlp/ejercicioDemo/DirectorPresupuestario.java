package ar.edu.info.unlp.ejercicioDemo;

public class DirectorPresupuestario {
	
	public Computadora crearEquipo(EquipoBuilder equipo) {
		equipo.crearPc();
		equipo.crearProcesador();
		equipo.crearMemoria();
		equipo.crearAlmacenamiento();
		equipo.crearGrafica();
		equipo.crearGabinete();
		return equipo.finalizarPc();
	}
	
	public Presupuesto CrearPresupuesto(String nombre, EquipoBuilder equipo) {
		return new Presupuesto(this.crearEquipo(equipo), nombre);
		
		
	}

}
