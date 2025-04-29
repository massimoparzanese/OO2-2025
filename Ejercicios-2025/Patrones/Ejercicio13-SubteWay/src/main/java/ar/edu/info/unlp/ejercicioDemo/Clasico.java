package ar.edu.info.unlp.ejercicioDemo;

public class Clasico extends Sanguche {

	
	public void crearPan() {
		this.ingredientes.add(new Ingrediente("Pan brioche", 100));
		
	}

	
	public void crearIngredientePrincipal() {
		this.ingredientes.add(new Ingrediente("Carne de ternera", 300));
		
	}

	
	public void crearAderezo() {
		this.ingredientes.add(new Ingrediente("Aderezo a base de mayonesa", 20));
		
	}

	
	public void adicional() {
		this.ingredientes.add(new Ingrediente("Tomate ", 80));
		
	}

}
