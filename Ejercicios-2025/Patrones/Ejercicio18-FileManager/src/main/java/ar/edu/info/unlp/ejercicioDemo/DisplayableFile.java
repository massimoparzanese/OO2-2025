package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface DisplayableFile {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public int getSize();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();

}
