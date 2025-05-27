package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2 implements FileComponent {
	
	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public FileOO2(String nombre, String extension, double tamanio, LocalDate fechaCreacion,
			LocalDate fechaModificacion, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getExtension() {
		return extension;
	}
	public double getTamanio() {
		return tamanio;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public String getPermisos() {
		return permisos;
	}
	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return "";
	}

}
