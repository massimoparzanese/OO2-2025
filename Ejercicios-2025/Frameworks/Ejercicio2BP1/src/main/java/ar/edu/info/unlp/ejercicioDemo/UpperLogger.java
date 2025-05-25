package ar.edu.info.unlp.ejercicioDemo;

import java.util.logging.Logger;

public class UpperLogger {
	
	private final Logger logger;

	public UpperLogger(Class<?> clazz) {
		this.logger = Logger.getLogger(clazz.getName());
	}

	public void info(String message) {
		logger.info(message.toUpperCase());
	}

	public void warning(String message) {
		logger.warning(message.toUpperCase());
	}

	public void severe(String message) {
		logger.severe(message.toUpperCase());
	}

	public void config(String message) {
		logger.config(message.toUpperCase());
	}
	public void fine(String message) {
		 logger.fine(message.toUpperCase());
	 }
	 public void finer(String message) {
		 logger.finer(message.toUpperCase());
	 }
	 public void finest(String message) {
		 logger.finer(message.toUpperCase());
	 }

	// Podés agregar más niveles si querés
}
