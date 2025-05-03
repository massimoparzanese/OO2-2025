package ar.edu.info.unlp.ejercicioDemo;

public class DisplayablePermisos extends FileDecorator {

	public DisplayablePermisos(DisplayableFile disFile) {
		super(disFile);
	}

	public String prettyPrint() {
		return this.previous.prettyPrint() + this.getPermisos();
	}

}
