package ar.edu.info.unlp.ejercicioDemo;

public class DisplayableSize extends FileDecorator {

	public DisplayableSize(DisplayableFile disFile) {
		super(disFile);
	}

	
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.previous.prettyPrint() + String.valueOf(this.getSize());
	}

}
