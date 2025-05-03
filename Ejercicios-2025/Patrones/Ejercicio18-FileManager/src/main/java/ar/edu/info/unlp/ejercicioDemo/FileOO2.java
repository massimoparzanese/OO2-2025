package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2 implements DisplayableFile{

	private String nombre;
	private String extension;
	private int size;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public FileOO2(String nombre, String extension, int size, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.size = size;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	public String prettyPrint() {
		
		return "";
	}

	
	public String getNombre() {
		
		return this.nombre;
	}

	
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.fechaModificacion;
	}

	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}

}
