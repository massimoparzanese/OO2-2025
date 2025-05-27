package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {
	
	protected FileComponent previous;

	public FileDecorator(FileComponent p) {
		this.previous = p;
	}
	public String getNombre() {
		
		return this.previous.getNombre();
	}

	
	public String getExtension() {
		return this.previous.getExtension();
	}

	
	public double getTamanio() {
		// TODO Auto-generated method stub
		return this.previous.getTamanio();
	}

	
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.previous.getFechaCreacion();
	}

	
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.previous.getFechaModificacion();
	}

	
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.previous.getPermisos();
	}
	
	

}
