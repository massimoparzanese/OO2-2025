package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public abstract class Sanguche {
	protected List<Ingrediente> ingredientes;
	
	public Sanguche() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}
	
	public abstract void crearPan();
	public abstract void crearIngredientePrincipal();
	public abstract void crearAderezo();
	public abstract void adicional();
	
	public double getPrecioTotal() {
		return this.ingredientes.stream().mapToDouble(i -> i.getPrecio()).sum();
	}

}
