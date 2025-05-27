package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface FileComponent {
	
	public String getNombre();
	public String getExtension();
	public double getTamanio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	public String prettyPrint();
	

}
