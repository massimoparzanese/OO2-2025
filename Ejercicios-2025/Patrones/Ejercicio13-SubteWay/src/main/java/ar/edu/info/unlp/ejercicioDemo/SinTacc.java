package ar.edu.info.unlp.ejercicioDemo;

public class SinTacc extends Sanguche{
	

	public void crearPan() {
		this.ingredientes.add(new Ingrediente("Pan de chipá", 150));
		
	}

	
	public void crearIngredientePrincipal() {
		this.ingredientes.add(new Ingrediente("Carne de pollo", 250));
		
	}

	
	public void crearAderezo() {
		this.ingredientes.add(new Ingrediente("Salsa tártara", 18));
		
	}

	
	public void adicional() {
		this.ingredientes.add(new Ingrediente("Verduras grilladas", 200));
		
	}

}
