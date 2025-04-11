package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Configuration{
    @Override
    public List<Pelicula> sugerir(Decodificador d) {
        return d.noVistas().stream()
                .sorted((p1, p2) -> {
                    int cmp = p1.comparePuntaje(p2.getPuntaje());
                    if (cmp == 0) {
                        cmp = p1.compareAnio(p2.getAnioEst());
                    }
                    return cmp;
                })
                .limit(3)
                .collect(Collectors.toList());
    }
}
