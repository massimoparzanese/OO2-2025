package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemporarioTest {

    Temporario t1;
    Temporario t2;
    Temporario t3;
    Temporario t4;
    @BeforeEach
    void setUp() throws Exception{
        t1 = new Temporario(true, 2, 100);
        t2 = new Temporario(true, 0, 0);
        t3 = new Temporario(false, 0, 10);
        t4 = new Temporario(false, 1, 5);
    }

    @Test
    void testAdicional(){
        assertEquals((5000 + (2000 * 2)), t1.adicional());
        assertEquals(5000, t2.adicional());
        assertEquals(0, t3.adicional());
        assertEquals(2000, t4.adicional());
    }

    @Test
    void testBasico(){
        assertEquals((20000 + (300 * 100)), t1.basico());
        assertEquals(20000, t2.basico());
    }

    @Test
    void testSueldo(){
        assertEquals(((20000 + (300 * 100)) + (5000 + (2000 * 2))- t1.descuento()), t1.sueldo());
        assertEquals((20000  + 5000 - t2.descuento()), t2.sueldo());
        assertEquals((20000 + (300 * 10) - t3.descuento()), t3.sueldo());
        assertEquals((20000 + (300 * 5) + 2000 - t4.descuento()), t4.sueldo());
    }
}
