package ar.edu.info.unlp.ejercicioDemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FileSystem {
	private List<Element> elementos;
	 public int tamanoTotalOcupado() {
		 return (int) this.elementos.stream().mapToDouble(elem -> elem.tamanioTotal()).sum();
	 }

	  /**
	   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	   * filesystem 
	   */
	  public Element archivoMasGrande() {
		  return this.elementos.stream()
				  .max((a1,a2) -> Double.compare(a1.buscarMasGrande().tamanioTotal(), 
						  a2.buscarMasGrande().tamanioTotal())).orElse(null);
	  }

	  /**
	   * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	   * del filesystem
	   */
	  public Element archivoMasNuevo() {
		    return this.elementos.stream()
		        .max(Comparator.comparing(e -> e.buscarMasGrande().buscarMasNuevo().getCreationDate()))
		        .orElse(null);
		}


	  /**
	   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	   * nivel del filesystem
	   */
	  public Element buscar(String nombre){
		  return this.elementos.stream().filter(e -> e.compareName(nombre)).findFirst().orElse(null);
	  }

	  /**
	   * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	   * contenido en cualquier nivel del filesystem
	   */
	  public List<Element> buscarTodos(String nombre) {
		    return this.elementos.stream()
		        .flatMap(e -> e.buscarTodos(nombre).stream())  // Convertir la lista a un Stream
		        .collect(Collectors.toList());  // Recolectar el Stream en una lista
		}


	  /**
	   * Retorna un String con los nombres de los elementos contenidos en todos los 
	   * niveles del filesystem. De cada elemento debe retornar el path completo
	   * (similar al comando pwd de linux) siguiendo el modelo presentado a
	   * continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2 	
	/Directorio A/Directorio A.2
	/Directorio B
	   */
	  public String listadoDeContenido() {
		  return this.elementos.stream().map(e -> e.listContent())
				  .collect(Collectors.joining(System.lineSeparator()));
	  }
	

}
