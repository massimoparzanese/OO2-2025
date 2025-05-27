package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String email;
	private List<VehiculoEnAlquiler> vehiculosEnAlquiler;
	
	public Usuario(String email) {
		this.email = email;
		this.vehiculosEnAlquiler = new ArrayList<VehiculoEnAlquiler>();
	}
	
	public void addVehiculo(VehiculoEnAlquiler vehAlq) {
		this.vehiculosEnAlquiler.add(vehAlq);
	}
	public void removeVehiculo(VehiculoEnAlquiler vehAlq) {
		this.vehiculosEnAlquiler.remove(vehAlq);
	}

}
