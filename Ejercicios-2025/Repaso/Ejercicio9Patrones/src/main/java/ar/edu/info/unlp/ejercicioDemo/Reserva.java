package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Reserva {

	private Usuario conductor;
	private VehiculoEnAlquiler vehiculo;
	private int cantDias;
	private LocalDate fecha;

	
	public Reserva(Usuario user, VehiculoEnAlquiler v, int cantDias, LocalDate fecha) {
		this.conductor = user;
		user.addVehiculo(v);
		this.vehiculo = v;
		this.cantDias = cantDias;
		this.fecha = fecha;
	}
	
	public double montoAPagar() {
		return this.cantDias * this.vehiculo.getPrecioPorDia();
	}
	
	public double montoAReembolsar(LocalDate fecha) {
		return this.vehiculo.montoAReembolsar(fecha, this);
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
}
