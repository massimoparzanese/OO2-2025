package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasanteTest {
    Pasante p1;
    @BeforeEach
    void setUp() throws Exception{
        p1 = new Pasante(true, 4);
    }

    @Test
    void testDescuento (){
        assertEquals((2600 + 100), p1.descuento());
    }
    @Test
    void testSueldo(){
        assertEquals((20000 + 2000 - (2600 + 100)), p1.sueldo());
    }
}
