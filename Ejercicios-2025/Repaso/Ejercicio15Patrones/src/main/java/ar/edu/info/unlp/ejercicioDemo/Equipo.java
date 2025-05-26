package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Componente> componentes;

    public Equipo(){
        this.componentes = new ArrayList<Componente>();
    }
    public void add(Componente c){
        this.componentes.add(c);
    }
    public void remove(Componente c){
        this.componentes.remove(c);
    }
    public double calcularConsumo(){
        return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
    }

    public double calcularPrecio(){
        return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
    }
}
