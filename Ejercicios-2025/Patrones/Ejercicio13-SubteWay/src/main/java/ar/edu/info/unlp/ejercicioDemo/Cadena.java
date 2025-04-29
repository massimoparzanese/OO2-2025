package ar.edu.info.unlp.ejercicioDemo;

public class Cadena {
	
	
	public void crear(Sanguche sanguche) {
		sanguche.crearPan();
		sanguche.crearAderezo();
		sanguche.crearIngredientePrincipal();
		sanguche.adicional();
	}
	
	public double obtenerPrecioSanguche(Sanguche sanguche) {
		return sanguche.getPrecioTotal();
	}

}
