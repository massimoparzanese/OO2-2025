package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class UltimoGenerador implements Generador{

    public String obtenerLibre(GestorNumerosDisponibles gestor){
        return gestor.getLineas().last();
    }
}
