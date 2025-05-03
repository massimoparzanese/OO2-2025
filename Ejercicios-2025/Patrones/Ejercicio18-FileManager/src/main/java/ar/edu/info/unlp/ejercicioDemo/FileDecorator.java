package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class FileDecorator implements DisplayableFile {
	
	protected DisplayableFile previous;
	
	public FileDecorator(DisplayableFile disFile) {
		this.previous = disFile;
	}
	
	public String getNombre() {
		return this.previous.getNombre();
	}
	public String getExtension() {
		return this.previous.getExtension();
	}
	
	public int getSize() {
		return this.previous.getSize();
	}
	
	public LocalDate getFechaCreacion() {
		return this.previous.getFechaCreacion();
	}
	
	public LocalDate getFechaModificacion() {
		return this.previous.getFechaModificacion();
	}
	
	public String getPermisos() {
		return this.previous.getPermisos();
	}

}
