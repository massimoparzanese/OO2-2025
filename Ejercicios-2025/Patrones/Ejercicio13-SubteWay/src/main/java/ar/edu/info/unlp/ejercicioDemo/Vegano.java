package ar.edu.info.unlp.ejercicioDemo;

public class Vegano extends Sanguche{

	public void crearPan() {
		this.ingredientes.add(new Ingrediente("Pan integral", 100));
		
	}

	
	public void crearIngredientePrincipal() {
		this.ingredientes.add(new Ingrediente("Milanesa de girgolas", 500));
		
	}

	
	public void crearAderezo() {
		this.ingredientes.add(new Ingrediente("Aderezo de salsa criolla", 20));
		
	}

	
	public void adicional() {}
}
