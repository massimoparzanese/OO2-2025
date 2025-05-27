package ar.edu.info.unlp.ejercicioDemo;

public class DisplayPermisos extends FileDecorator{

	public DisplayPermisos(FileComponent p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getPermisos();
	}

}
