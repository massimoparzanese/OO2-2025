package ar.edu.info.unlp.ejercicioDemo;

public class DisplayableFechaCreacion extends FileDecorator{

	public DisplayableFechaCreacion(DisplayableFile disFile) {
		super(disFile);
	}

	
	public String prettyPrint() {
		return this.previous.prettyPrint() + String.valueOf(this.getFechaCreacion());
	}

}
