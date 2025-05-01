package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Combinada implements Prenda{

	private List<Prenda> prendas;
	
	public Combinada() {
		this.prendas = new ArrayList<Prenda>();
	}

	
	public void add(Prenda p) {
		this.prendas.add(p);
	}

	
	public void remove(Prenda p) {
		this.prendas.remove(p);
		
	}

	
	public double calcularPrecioTotal() {
		
		return this.prendas.stream().mapToDouble(p -> p.getPrecio()).sum() * 0.5;
	}

	
	public double getPrecio() {
		return this.calcularPrecioTotal();
	}
}
