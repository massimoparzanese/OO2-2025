package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();
	public boolean agregarNumeroTelefono(String str) {
		if (!this.guia.contiene(str)) {
			guia.add(str);
			return true;
		}
		return false;
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuario(String data, String nombre, String tipo) {
		Cliente var;
		if (tipo.equals("fisica")) {
			var = new ClienteFisico(nombre,this.obtenerNumeroLibre(), data);
		}
		else {
			var = new ClienteJuridico(nombre,this.obtenerNumeroLibre(), data);
		}
		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) {
		Llamada llamada;
		if(t.equals("nacional")){
			llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		}
		else{
			llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		}
		llamadas.add(llamada);
		origen.add(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
