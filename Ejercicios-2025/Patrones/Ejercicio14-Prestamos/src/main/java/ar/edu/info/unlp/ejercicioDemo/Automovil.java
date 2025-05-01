package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil implements Prenda {
	
	private int modelo;
	private int km;
	private double costo;
	
	public Automovil(int m, int km, double c) {
		this.modelo = m;
		this.km = km;
		this.costo = c;
	}
	public void add(Prenda p) {}
	
	public void remove(Prenda p) {}
	
	public double calcularPrecioTotal() {
		return this.getPrecio() * 0.7;
	}
	
	public double getPrecio() {
		
		return this.costo * (1 - (0.10 * (LocalDate.now().getYear() - this.modelo)));
	}
	
	

}
