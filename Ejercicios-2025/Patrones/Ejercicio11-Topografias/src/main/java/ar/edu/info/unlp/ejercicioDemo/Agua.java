package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Agua implements Topografia{

	
	public void add(Topografia t) {}

	
	public void remove(Topografia t) {}

	
	public double distribucionAgua() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public double distribucionTierra() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean comparar(Topografia topo) {
		return topo.comparaConAgua(this);
	}

	
	public boolean comparaConAgua(Topografia topo) {
		return true;
	}

	
	public boolean comparaConMixta(Topografia topo) {
		return false;
	}
	public boolean comparaConTierra(Topografia topo) {
		return false;
	}
	
	public List<Topografia> getTopografias() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
