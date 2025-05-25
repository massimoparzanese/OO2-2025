package ar.edu.info.unlp.ejercicioDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONLogger {
	
	private final Logger logger;

	
	 public JSONLogger(Class<?> clazz) {
	        this.logger = Logger.getLogger(clazz.getName());
	    }
	 
	 public void info(String message) {
		 logger.info(this.convertJSON(message, "info")); 
	 }
	 public void warning(String message) {
		 logger.warning(this.convertJSON(message, "warning")); 
	 }
	 public void severe(String message) {
		 logger.severe(this.convertJSON(message, "severe"));
	 }
	 public void config(String message) {
		 logger.config(this.convertJSON(message, "config"));
	 }
	 public void fine(String message) {
		 logger.fine(this.convertJSON(message, "fine"));
	 }
	 public void finer(String message) {
		 logger.finer(this.convertJSON(message, "finer"));
	 }
	 public void finest(String message) {
		 logger.finer(this.convertJSON(message, "finest"));
	 }
	 
	 private String convertJSON(String message, String level) {
		 Map<String, Object> jsonMap = new HashMap<>();
		 jsonMap.put("message",message);
		 jsonMap.put("level", level);
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL); // Opcional: excluir nulos
		 try {
		      return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonMap);
		    } catch (Exception e) {
		      return "Error al convertir a JSON: ";
		    }
		 
	 }

}
