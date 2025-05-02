package ar.edu.info.unlp.ejercicioDemo;

public class Componente {

	private String nombre;
	private String descripcion;
	private double consumo;
	private double costo;
	
	public Componente(String nombre, String desc, double consumo,  double cost) {
		this.nombre = nombre;
		this.consumo = consumo;
		this.descripcion = desc;
		this.costo = cost;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getConsumo() {
		return this.consumo;
	}
	public double getCosto() {
		return this.costo;
	}
	
	
}
