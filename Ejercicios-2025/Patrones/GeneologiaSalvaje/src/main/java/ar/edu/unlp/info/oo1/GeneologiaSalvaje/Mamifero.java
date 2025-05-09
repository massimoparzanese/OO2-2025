package ar.edu.unlp.info.oo1.GeneologiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	public Mamifero() {
		this.fechaNacimiento  = LocalDate.now();
	}
	
	public Mamifero(String id) {
		this.identificador = id;
		this.fechaNacimiento  = LocalDate.now();
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.madre != null)
			return this.madre.getPadre();
		else return null;
				
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null)
			return this.madre.getMadre();
		else return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre != null)
			return this.padre.getPadre();
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre != null)
			return this.padre.getMadre();
		else return null;
	}
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(unMamifero.equals(this.padre) || unMamifero.equals(this.madre))
			return true;
		if ((this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) || 
				this.madre != null && this.madre.tieneComoAncestroA(unMamifero))
					return true;
		return false;
	}
}
