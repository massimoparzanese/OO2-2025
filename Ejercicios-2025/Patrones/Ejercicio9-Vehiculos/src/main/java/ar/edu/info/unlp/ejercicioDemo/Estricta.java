package ar.edu.info.unlp.ejercicioDemo;

public class Estricta implements PoliticaCancelacion{

	/*
	 * Si el automóvil tiene política 
	 * de cancelación estricta, no se reembolsará nada (0, cero) 
	 * sin importar la fecha tentativa de cancelación.  
	 * */
	public double devolverMonto(Reserva r) {
		
		return 0;
	}

}
