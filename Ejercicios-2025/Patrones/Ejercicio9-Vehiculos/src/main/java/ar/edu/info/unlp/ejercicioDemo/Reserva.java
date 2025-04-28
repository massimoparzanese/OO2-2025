package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class Reserva {
	private int cantDias;
	private LocalDate fecha;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	
	public Reserva(int cantDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto ) {
		this.cantDias = cantDias;
		this.fecha = fecha;
		this.conductor = conductor;
		this.auto = auto;
		this.conductor.addAlquiler(auto);
	}

	public int getCantDias() {
		return cantDias;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public double montoAReembolsar() {
		return this.auto.montoAReembolsar(this);
	}
	
	public double montoPorAlquiler() {
		return this.cantDias * auto.getPrecioPorDia();
	}
	

}
