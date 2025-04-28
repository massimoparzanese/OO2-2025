package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class AutoEnAlquiler {
	
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaCancelacion politica;
	
	public AutoEnAlquiler (double precioPDia, int cantP, String marca) {
		this.precioPorDia = precioPDia;
		this.cantidadPlazas = cantP;
		this.marca = marca;
	}
	
	public void setPolitica(PoliticaCancelacion p) {
		this.politica = p;
	}
	
	
	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public double montoAReembolsar(Reserva r) {
		
		return this.politica.devolverMonto( r);
	}
	
	
	
	

}
