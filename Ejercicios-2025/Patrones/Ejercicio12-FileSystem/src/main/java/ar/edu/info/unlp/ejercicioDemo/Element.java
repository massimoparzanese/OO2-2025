package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public abstract class Element {
	
	protected String name;
	private LocalDate creationDate;
	
	public Element(String name) {
		this.name = name;
		this.creationDate = LocalDate.now();
	}
	
	public abstract double tamanioTotal();
	public abstract File buscarMasGrande();
	public abstract List<Element> buscarTodos(String name);
	public abstract String listContent();
	public abstract void add(Element elem);
	public abstract void remove(Element elem);
	public abstract Element buscar(String name);
	public abstract Element buscarMasNuevo();
	public LocalDate getCreationDate() {
		return this.creationDate;
	}
	public boolean compareName(String name) {
		return this.name.equals(name);
	}
	
}
