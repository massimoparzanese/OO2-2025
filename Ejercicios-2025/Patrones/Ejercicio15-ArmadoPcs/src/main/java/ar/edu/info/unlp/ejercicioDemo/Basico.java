package ar.edu.info.unlp.ejercicioDemo;

public class Basico extends EquipoBuilder {

	public Basico(Catalogo c) {
		super(c);
	}

	
	public void crearProcesador() {
		this.pc.add(this.catalogo.getComponente("procesador basico"));
		
	}

	
	public void crearGabinete() {
		this.pc.add(this.catalogo.getComponente("gabinete estandar"));
		
	}

	
	public void crearAlmacenamiento() {
		this.pc.add(this.catalogo.getComponente("hdd 500 gb"));
		
	}

	
	public void crearMemoria() {
		this.pc.add(this.catalogo.getComponente("8 gb"));
		
	}

	
	public void crearGrafica() {}

}
