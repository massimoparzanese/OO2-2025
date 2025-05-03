package ar.edu.info.unlp.ejercicioDemo;

public class DisplayableFechaModificacion extends FileDecorator{

	public DisplayableFechaModificacion(DisplayableFile disFile) {
		super(disFile);
	}

	public String prettyPrint() {
		
		return this.previous.prettyPrint() + String.valueOf(this.getFechaModificacion());
	}

}
