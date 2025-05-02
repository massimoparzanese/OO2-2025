package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Presupuesto {
	
	private String nombre;
	private LocalDate solicitud;
	private Computadora computadora;
	
	public Presupuesto(Computadora compu, String nomb) {
		this.nombre = nomb;
		this.computadora = compu;
		this.solicitud = LocalDate.now();
	}
	
	public LocalDate getFechaSolicitud() {
		return this.solicitud;
	}
	
	public String getNombreSolicitante() {
		return this.nombre;
	}

}
