package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Catalogo {

    private List<Componente> componentes;

    public Catalogo(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public Componente getComponente(String descripcion){
        return this.componentes.stream()
                .filter(c -> descripcion.equals(c.getDescripcion()))
                .findFirst().orElse(null);
    }

}
