package ar.edu.info.unlp.ejercicioDemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Similaridad implements Configuration{

    public List<Pelicula> sugerir(Decodificador d) {
        Set<Pelicula> similaresNoVistas = new HashSet<Pelicula>();

        // Recorremos las películas vistas
        d.getReproducidas().stream().forEach(vista -> {
            // Usamos noVistas() para obtener las películas no vistas
            d.noVistas().stream()
                    .filter(p -> vista.esSimilar(p))  // Usamos esSimilar() para encontrar películas similares
                    .forEach(p -> similaresNoVistas.add(p));  // Agrego las similares al Set
        });

        // Ordenamos las sugerencias por año y limitamos a 3
        return similaresNoVistas.stream()
                .sorted((p1, p2) -> p1.compareAnio(p2.getAnioEst()))  // Orden por año de estreno (más reciente primero)
                .limit(3)
                .collect(Collectors.toList());
    }


}
