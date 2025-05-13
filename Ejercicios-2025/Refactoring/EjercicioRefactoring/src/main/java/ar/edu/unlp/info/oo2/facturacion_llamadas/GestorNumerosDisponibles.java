package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private Generador tipoGenerador = new UltimoGenerador();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		String linea = tipoGenerador.obtenerLibre(this);
		lineas.remove(linea);
		return linea;
	}

	public void cambiarTipoGenerador(Generador valor) {
		this.tipoGenerador = valor;
	}

}
