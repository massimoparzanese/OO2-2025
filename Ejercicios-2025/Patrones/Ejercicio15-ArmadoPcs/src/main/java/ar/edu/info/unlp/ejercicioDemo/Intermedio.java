package ar.edu.info.unlp.ejercicioDemo;

public class Intermedio extends EquipoBuilder {
	
	public Intermedio(Catalogo c) {
		super(c);
	}

	
	public void crearProcesador() {
		this.pc.add(this.catalogo.getComponente("procesador intermedio"));
		
	}

	
	public void crearGabinete() {
		this.pc.add(this.catalogo.getComponente("gabinete intermedio"));
		this.pc.add(this.catalogo.getComponente("fuente 800 w"));
	}

	
	public void crearAlmacenamiento() {
		this.pc.add(this.catalogo.getComponente("ssd 500 gb"));
		
	}

	
	public void crearMemoria() {
		this.pc.add(this.catalogo.getComponente("16 gb"));
		
	}

	
	public void crearGrafica() {
		this.pc.add(this.catalogo.getComponente("gtx 1650"));
	}


}
