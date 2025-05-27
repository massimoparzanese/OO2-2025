package ar.edu.info.unlp.ejercicioDemo;

public class DisplayExtension extends FileDecorator {

	public DisplayExtension(FileComponent p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.previous.prettyPrint() + this.getExtension();
	}

}
