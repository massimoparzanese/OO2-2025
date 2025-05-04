/**
 * 
 */
package ar.info.juego.Encriptador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.info.juego.Encriptador.RC4;

/**
 * @author gperez
 *
 */
class RC4Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		RC4 rc4 = new RC4();
		
		String key = "clave";
		String plaintext = "Hola mundo!";
        assertEquals(plaintext, rc4.desencriptar(rc4.encriptar(plaintext, key), key));
	}

}
