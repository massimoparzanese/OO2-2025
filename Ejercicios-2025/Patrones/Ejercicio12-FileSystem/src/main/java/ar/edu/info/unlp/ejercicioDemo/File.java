package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class File extends Element{
	
	private double size;
	public File(String name, double size) {
		super(name);
		this.size = size;
	}

	public double tamanioTotal() {
		
		return this.size;
	}
	public File buscarMasGrande() {
		
		return this;
	}

	
	public List<Element> buscarTodos(String name) {
		return name.equals(this.name) ? List.of(this) : null;
	}

	
	public String listContent() {
		
		return "/" + this.name + "\n";
	}

	
	public void add(Element elem) {}

	
	public void remove(Element elem) {}

	
	public Element buscar(String name) {
		
		return name.equals(this.name) ? this : null;
	}

	
	public Element buscarMasNuevo() {
		return this;
	}
}
