package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion {

	
	public double montoADevolver(LocalDate fecha, Reserva r) {
		Long dif = ChronoUnit.DAYS.between(fecha, r.getFecha());
		return (dif >= 7) ? r.montoAPagar()
			     : (dif >= 2) ? r.montoAPagar() * 0.5
			     : 0;

	}

}
