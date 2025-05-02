package ar.edu.info.unlp.ejercicioDemo;

public abstract class EquipoBuilder  {
	
	protected Computadora pc;
	protected Catalogo catalogo;
	
	public EquipoBuilder(Catalogo c) {
		this.catalogo = c;
	}
	
	public void crearPc() {
		this.pc = new Computadora();
	}
	
	public Computadora finalizarPc() {
		return this.pc;
	}
	public abstract void crearProcesador();
	public abstract void crearGabinete();
	public abstract void crearAlmacenamiento();
	public abstract void crearMemoria();
	public abstract void crearGrafica();
	

}
