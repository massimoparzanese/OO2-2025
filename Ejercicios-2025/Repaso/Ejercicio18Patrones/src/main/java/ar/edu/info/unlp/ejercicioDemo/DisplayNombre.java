package ar.edu.info.unlp.ejercicioDemo;

public class DisplayNombre extends FileDecorator{

	public DisplayNombre(FileComponent p) {
		super(p);
	}

	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getNombre();
	}

}
