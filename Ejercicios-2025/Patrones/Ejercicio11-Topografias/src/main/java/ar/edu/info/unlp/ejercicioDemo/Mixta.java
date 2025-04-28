package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mixta implements Topografia{

	private List<Topografia> topografias;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
	    this.topografias = new ArrayList<>(Arrays.asList(t1, t2, t3, t4));
	}

	public void add(Topografia t) {
		this.topografias.add(t);
	}

	
	public void remove(Topografia t) {
		this.topografias.remove(t);
		
	}

	
	public double distribucionAgua() {
		return this.topografias.stream()
			    .mapToDouble(t -> t.distribucionAgua())
			    .average()
			    .orElse(0);

	}

	
	public double distribucionTierra() {
		return this.topografias.stream()
			    .mapToDouble(t -> t.distribucionTierra())
			    .average()
			    .orElse(0);
	}

	
	public boolean comparar(Topografia topo) {
		return topo.comparaConMixta(this);
	}

	
	public boolean comparaConAgua(Topografia topo) {
		return false;
	}

	
	public boolean comparaConTierra(Topografia topo) {
		return false;
	}

	
	public boolean comparaConMixta(Topografia topo) {
		return IntStream.range(0, this.topografias.size())
			    .allMatch(i -> this.topografias.get(i).comparar(topo.getTopografias().get(i)));
	}

	
	public List<Topografia> getTopografias() {
		return new ArrayList<Topografia>(this.topografias);
	}

}
