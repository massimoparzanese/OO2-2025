package ar.edu.unlp.info.oo1.GeneologiaSalvaje;

import java.time.LocalDate;

public class Mamifero extends AbstractMamifero {


	public Mamifero() {
		super(LocalDate.now());
	}

	public Mamifero(String id) {
		super(id, LocalDate.now());
	}


	@Override
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public AbstractMamifero getPadre() {
		return this.padre;
	}

	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public AbstractMamifero getMadre() {
		return this.madre;
	}

	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public AbstractMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public AbstractMamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public AbstractMamifero getAbueloPaterno() {
			return this.padre.getPadre();
	}
	
	public AbstractMamifero getAbuelaPaterna() {
			return this.padre.getMadre();
	}
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(unMamifero.equals(this.padre) || unMamifero.equals(this.madre))
			return true;
		else if ((this.padre.tieneComoAncestroA(unMamifero)) || this.madre.tieneComoAncestroA(unMamifero))
					return true;
		return false;
	}
}
