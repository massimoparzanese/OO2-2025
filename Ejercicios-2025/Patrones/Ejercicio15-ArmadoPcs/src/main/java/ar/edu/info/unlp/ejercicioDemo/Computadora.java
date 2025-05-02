package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
	
	private List<Componente> componentes;
	
	public Computadora() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void add(Componente c) {
		this.componentes.add(c);
	}
	
	public void remove(Componente c) {
		this.componentes.remove(c);
	}
	
	public double calcularPrecio() {
		return this.componentes.stream().mapToDouble(comp -> comp.getCosto()).sum() * 1.21; 
	}
	
	public double calcularConsumo() {
		return this.componentes.stream().mapToDouble(comp -> comp.getConsumo()).sum();
	}

}
