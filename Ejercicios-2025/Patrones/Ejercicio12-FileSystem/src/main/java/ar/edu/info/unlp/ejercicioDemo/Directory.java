package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Directory extends Element {
	
	private List<Element> elementos;
	
	public Directory(String name) {
		super(name);
		this.elementos = new ArrayList<Element>();
	}

	
	public double tamanioTotal() {
		return this.elementos.stream().mapToDouble(e -> e.tamanioTotal()).sum();
	}

	
	public File buscarMasGrande() {
	    return this.elementos.stream()
	        .map(e -> e.buscarMasGrande()) 
	        .filter(e -> e instanceof File) 
	        .map(e -> (File) e)
	        .max(Comparator.comparingDouble(File::tamanioTotal)) 
	        .orElse(null); 
	}


	
	public List<Element> buscarTodos(String name) {
		return this.elementos.stream()
		        .flatMap(e -> e.buscarTodos(name).stream())
		        .collect(Collectors.toList());
	}

	
	public String listContent() {
		
		return this.elementos.stream()
				.map(e -> "/" + this.name + e.listContent()) 
		        .collect(Collectors.joining(""));
	}

	
	public void add(Element elem) {
		this.elementos.add(elem);
		
	}

	
	public void remove(Element elem) {
		this.elementos.remove(elem);
		
	}

	
	public Element buscar(String name) {
		Element elem = this.elementos.stream()
				.filter(e -> e.compareName(name))
				.findFirst().orElse(null);
		return elem != null ? elem : this.elementos
				.stream().map(e -> e.buscar(name))
				.findFirst().orElse(null);
	}

	
	public Element buscarMasNuevo() {
		return this.elementos.stream()
			    .map(e -> e.buscarMasNuevo())
			    .filter(e -> e instanceof File)
			    .map(e -> (File) e)
			    .max(Comparator.comparing(File::getCreationDate))
			    .orElse(null);

	}

}
