package ar.edu.info.unlp.ejercicioDemo;

public class DisplayFechaModificacion extends FileDecorator{

	public DisplayFechaModificacion(FileComponent p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getFechaModificacion();
	}

}
