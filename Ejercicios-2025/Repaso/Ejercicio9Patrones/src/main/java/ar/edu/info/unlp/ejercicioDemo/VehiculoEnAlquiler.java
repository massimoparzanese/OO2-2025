package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class VehiculoEnAlquiler {
	private double precioPorDia;
	private int cantPlazas;
	private String marca;
	private PoliticaCancelacion politica;
	
	public VehiculoEnAlquiler(String marca, double precioPorDia, int cantPlazas,PoliticaCancelacion pol) {
		this.precioPorDia = precioPorDia;
		this.marca = marca;
		this.cantPlazas = cantPlazas;
		this.politica = pol;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public double montoAReembolsar(LocalDate fecha, Reserva reserva) {
		return this.politica.montoADevolver(fecha, reserva);
	}

}
