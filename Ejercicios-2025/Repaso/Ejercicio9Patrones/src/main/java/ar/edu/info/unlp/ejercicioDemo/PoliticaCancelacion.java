package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface PoliticaCancelacion {

	public double montoADevolver(LocalDate fecha, Reserva r);
}
