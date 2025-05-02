package ar.edu.info.unlp.ejercicioDemo;

public class Gamer extends EquipoBuilder {

	public Gamer(Catalogo c) {
		super(c);
	}
	

	public void crearProcesador() {
		this.pc.add(this.catalogo.getComponente("procesador gamer"));
		this.pc.add(this.catalogo.getComponente("pad termico"));
		this.pc.add(this.catalogo.getComponente("cooler"));
	}

	
	public void crearGabinete() {
		this.pc.add(this.catalogo.getComponente("gabinete gamer"));
		double consumo = this.pc.calcularConsumo();
		this.pc.add(
				this.catalogo
				.getComponente("fuente " + (consumo + (consumo * 0.5)) + " w"));
		
	}

	
	public void crearAlmacenamiento() {
		this.pc.add(this.catalogo.getComponente("ssd 500 gb"));
		this.pc.add(this.catalogo.getComponente("ssd 1tb"));
	}

	
	public void crearMemoria() {
		this.pc.add(this.catalogo.getComponente("32 gb"));
		this.pc.add(this.catalogo.getComponente("32 gb"));
		
	}

	
	public void crearGrafica() {
		this.pc.add(this.catalogo.getComponente("rtx 4090"));
	}

}
