package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{

	
	public double montoADevolver(LocalDate fecha, Reserva r) {
		return !fecha.isEqual(r.getFecha()) ? r.montoAPagar() : 0;
	}

}
