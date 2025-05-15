package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;

public class PrimeroGenerador implements Generador{

    public String obtenerLibre(GestorNumerosDisponibles gestor){
        return gestor.getLineas().first();
    }
}
