package ar.edu.info.unlp.ejercicioDemo;

public class DisplayableExtension extends FileDecorator {

	public DisplayableExtension(DisplayableFile disFile) {
		super(disFile);
	}

	
	public String prettyPrint() {
		return this.previous.prettyPrint() +  this.getExtension();
	}

}
