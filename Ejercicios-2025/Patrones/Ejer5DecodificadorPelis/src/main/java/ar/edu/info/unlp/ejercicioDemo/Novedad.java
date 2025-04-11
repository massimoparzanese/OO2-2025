package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Configuration{

    public List<Pelicula> sugerir(Decodificador d) {
        return d.noVistas().stream().sorted((p1, p2) -> {
                  return p1.compareAnio(p2.getAnioEst());
                })
                .limit(3)
                .collect(Collectors.toList());
    }
}
