package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private List<Componente> componentes;
	public Catalogo() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void addComponente(Componente c) {
		this.componentes.add(c);
	}
	public void removeComponente(Componente c) {
		this.componentes.remove(c);
	}
	
	public Componente getComponente(String descripcion) {
		return this.componentes.stream().
				filter(c -> descripcion.equals(c.getDescripcion()))
				.findFirst().orElse(null);
	}
}
