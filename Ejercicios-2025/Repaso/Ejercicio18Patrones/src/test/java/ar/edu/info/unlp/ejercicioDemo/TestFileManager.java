package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFileManager {
	
	private FileManager fileMan;
	private FileComponent file;
	private FileDecorator decNom;
	private FileDecorator decFechaCrea;
	private FileDecorator decExtension;
	private FileDecorator decTamanio;
	private FileDecorator decPermisos;
	private LocalDate fecha; // 26 de mayo de 2025
	@BeforeEach
	void setUp() throws Exception {
		fileMan = new FileManager();
		fecha = LocalDate.of(2025, 5, 26);
		file = new FileOO2("Pipi",".tar.gz",400.5,fecha,fecha,"drwxrwxr");
	}
	
	@Test
	void testPrimerEjemplo() {
		// nombre - extensión
		decNom = new DisplayNombre(file);
		decExtension = new DisplayExtension(decNom);
		assertEquals("Pipi.tar.gz",decExtension.prettyPrint());
	}
	@Test
	void testSegundoEjemplo() {
		// nombre - fecha de creación - extensión
		decNom = new DisplayNombre(file);
		decFechaCrea = new DisplayFechaCreacion(decNom);
		decExtension = new DisplayExtension(decFechaCrea);
		assertEquals("Pipi"+fecha+".tar.gz",decExtension.prettyPrint());
	}
	@Test
	void testTercerEjemplo() {
		// nombre - tamaño - permisos - extensión
		decNom = new DisplayNombre(file);
		decTamanio = new DisplayTamanio(decNom);
		decPermisos = new DisplayPermisos(decTamanio);
		decExtension = new DisplayExtension(decPermisos);
		assertEquals("Pipi"+400.5+"drwxrwxr"+".tar.gz",decExtension.prettyPrint());
	}

}
