package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Tierra implements Topografia {

	
	public void add(Topografia t) {}

	
	public void remove(Topografia t) {}

	
	public double distribucionAgua() {
		return 0;
	}

	
	public double distribucionTierra() {
		return 1;
	}

	
	public boolean comparar(Topografia topo) {
		return topo.comparaConTierra(this);
	}

	
	public boolean comparaConAgua(Topografia topo) {
		return false;
	}

	
	public boolean comparaConTierra(Topografia topo) {
		return true;
	}

	
	public boolean comparaConMixta(Topografia topo) {
		return false;
	}

	
	public List<Topografia> getTopografias() {
		return null;
	}

}
