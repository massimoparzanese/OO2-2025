package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public interface Topografia {
	
	public void add(Topografia t);
	public void remove(Topografia t);
	
	public double distribucionAgua();
	public double distribucionTierra();
	public boolean comparar(Topografia topo);
	public boolean comparaConAgua(Topografia topo);
	public boolean comparaConTierra(Topografia topo);
	public boolean comparaConMixta(Topografia topo);
	public List<Topografia> getTopografias();

}
