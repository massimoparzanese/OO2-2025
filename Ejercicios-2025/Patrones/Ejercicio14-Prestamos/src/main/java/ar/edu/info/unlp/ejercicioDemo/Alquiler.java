package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Prenda{
	private LocalDate comienzo;
	private LocalDate fin;
	private double costo;
	
	public Alquiler(LocalDate comienzo, LocalDate f, double c) {
		this.comienzo = comienzo;
		this.fin = f;
		this.costo = c;
	}
	public void add(Prenda p) {}
	
	public void remove(Prenda p) {}
	
	public double calcularPrecioTotal() {
		return this.getPrecio() * 0.9;
	}
	
	public double getPrecio() {
		return (ChronoUnit.MONTHS.between(fin, comienzo)) * this.costo;
	}

}
