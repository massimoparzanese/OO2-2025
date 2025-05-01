package ar.edu.info.unlp.ejercicioDemo;

public class Inmueble implements Prenda{
	
	private String direc;
	private double superficie;
	private double costoM3;
	
	public Inmueble(String direc, double superficie, double costoM3) {
		this.direc = direc;
		this.superficie = superficie;
		this.costoM3 = costoM3;
	}
	public void add(Prenda p) {}
	
	public void remove(Prenda p) {}
	
	public double calcularPrecioTotal() {
		
		return this.getPrecio() * 0.2;
	}
	
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.costoM3 * this.superficie;
	}

}
