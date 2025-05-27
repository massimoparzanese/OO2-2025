package ar.edu.info.unlp.ejercicioDemo;

public class DisplayFechaCreacion extends FileDecorator {

	public DisplayFechaCreacion(FileComponent p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getFechaCreacion();
	}

}
