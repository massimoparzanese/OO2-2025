package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{

	public Flexible() {
		
	}
	/*
	 * Si el automóvil tiene política de cancelación 
	 * flexible, se reembolsará el monto total sin 
	 * importar la fecha de cancelación (que de todas 
	 * maneras debe ser anterior a la fecha de inicio de la reserva). 
	 */
	public double devolverMonto(Reserva r) {
		if(LocalDate.now().isAfter(r.getFecha()))
			return r.montoPorAlquiler() * 0.50;
		return 0;
	}

}
