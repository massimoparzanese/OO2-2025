package ar.edu.info.unlp.ejercicioDemo;

public class Ingrediente {
	
	private String nombre;
	private double precio;
	
	public Ingrediente(String nom, double p) {
		this.nombre = nom;
		this.precio = p;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String toString() {
		return this.nombre + "(" + this.precio + " pesos)" + " ";
	}

}
