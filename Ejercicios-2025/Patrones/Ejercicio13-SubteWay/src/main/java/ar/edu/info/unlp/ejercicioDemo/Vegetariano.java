package ar.edu.info.unlp.ejercicioDemo;

public class Vegetariano extends Sanguche{

	
	public void crearPan() {
		this.ingredientes.add(new Ingrediente("Pan con semillas", 120));
		
	}

	
	public void crearIngredientePrincipal() {
		this.ingredientes.add(new Ingrediente("Provoleta Grillada", 200));
		
	}

	
	public void crearAderezo() {}

	
	public void adicional() {
		this.ingredientes.add(new Ingrediente("Berenjenas al escabeche", 100));
		
	}

}
