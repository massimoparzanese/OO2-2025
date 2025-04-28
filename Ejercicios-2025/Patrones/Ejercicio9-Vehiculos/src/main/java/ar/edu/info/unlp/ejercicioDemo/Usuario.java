package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private List<AutoEnAlquiler> autosAlquiler;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.autosAlquiler = new ArrayList<AutoEnAlquiler>();
	}
	
	public void addAlquiler(AutoEnAlquiler a) {
		this.autosAlquiler.add(a);
	}
	
	public void removeAlquiler(AutoEnAlquiler a) {
		this.autosAlquiler.remove(a);
	}
}
