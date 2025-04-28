package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion{

	/*
	 * Si el automóvil tiene política de cancelación 
	 * moderada, se reembolsará el monto total si la 
	 * cancelación se hace hasta una semana antes y 50% 
	 * si se hace hasta 2 días antes.
	 * */
	public double devolverMonto(Reserva r) {
		long dias = ChronoUnit.DAYS.between(r.getFecha(), LocalDate.now());
		return (dias >= 7) ? r.montoPorAlquiler()
			     : (dias >= 2) ? r.montoPorAlquiler() * 50
			     : 0;

	}

}
