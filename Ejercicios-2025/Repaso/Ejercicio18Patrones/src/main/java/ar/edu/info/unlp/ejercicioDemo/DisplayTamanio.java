package ar.edu.info.unlp.ejercicioDemo;

public class DisplayTamanio extends FileDecorator{

	public DisplayTamanio(FileComponent p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getTamanio();
	}

}
