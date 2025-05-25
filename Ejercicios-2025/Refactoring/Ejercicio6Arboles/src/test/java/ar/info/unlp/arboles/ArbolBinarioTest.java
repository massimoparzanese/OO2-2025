package ar.info.unlp.arboles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.info.unlp.arboles.ArbolBinario;

class ArbolBinarioTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	  @Test
	    public void testUnSoloNodo() {
	        ArbolBinarioAbstracto arbol = new ArbolBinario(10);
	        assertEquals("10 - ", arbol.recorrerPreorden());
	        assertEquals("10 - ", arbol.recorrerInorden());
	        assertEquals("10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testSoloHijoIzquierdo() {
	    	ArbolBinarioAbstracto arbol = new ArbolBinario(10);
	        arbol.setHijoIzquierdo(new ArbolBinario(5));
	        assertEquals("10 - 5 - ", arbol.recorrerPreorden());
	        assertEquals("5 - 10 - ", arbol.recorrerInorden());
	        assertEquals("5 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testSoloHijoDerecho() {
	    	ArbolBinarioAbstracto arbol = new ArbolBinario(10);
	        arbol.setDerecha(new ArbolBinario(15));
	        assertEquals("10 - 15 - ", arbol.recorrerPreorden());
	        assertEquals("10 - 15 - ", arbol.recorrerInorden());
	        assertEquals("15 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testArbolCompletoTresNodos() {
	    	ArbolBinarioAbstracto arbol = new ArbolBinario(10);
	        arbol.setHijoIzquierdo(new ArbolBinario(5));
	        arbol.setDerecha(new ArbolBinario(15));
	        assertEquals("10 - 5 - 15 - ", arbol.recorrerPreorden());
	        assertEquals("5 - 10 - 15 - ", arbol.recorrerInorden());
	        assertEquals("5 - 15 - 10 - ", arbol.recorrerPostorden());
	    }

	    @Test
	    public void testArbolConVariosNiveles() {
	    	ArbolBinarioAbstracto arbol = new ArbolBinario(10);
	        ArbolBinarioAbstracto n5 = new ArbolBinario(5);
	        ArbolBinarioAbstracto n15 = new ArbolBinario(15);
	        ArbolBinarioAbstracto n3 = new ArbolBinario(3);
	        ArbolBinarioAbstracto n7 = new ArbolBinario(7);
	        ArbolBinarioAbstracto n12 = new ArbolBinario(12);
	        ArbolBinarioAbstracto n18 = new ArbolBinario(18);

	        arbol.setHijoIzquierdo(n5);
	        arbol.setDerecha(n15);
	        n5.setHijoIzquierdo(n3);
	        n5.setDerecha(n7);
	        n15.setHijoIzquierdo(n12);
	        n15.setDerecha(n18);

	        assertEquals("10 - 5 - 3 - 7 - 15 - 12 - 18 - ", arbol.recorrerPreorden());
	        assertEquals("3 - 5 - 7 - 10 - 12 - 15 - 18 - ", arbol.recorrerInorden());
	        assertEquals("3 - 7 - 5 - 12 - 18 - 15 - 10 - ", arbol.recorrerPostorden());
	    }
	}
