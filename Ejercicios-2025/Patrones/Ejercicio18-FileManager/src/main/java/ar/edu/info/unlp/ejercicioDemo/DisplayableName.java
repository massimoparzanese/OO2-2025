package ar.edu.info.unlp.ejercicioDemo;

public class DisplayableName extends FileDecorator{

	public DisplayableName(DisplayableFile disFile) {
		super(disFile);
	}

	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + this.getNombre();
	}

}
