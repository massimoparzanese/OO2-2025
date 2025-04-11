package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {

    private List<Pelicula> peliculas;
    private List<Pelicula> reproducidas;
    private Configuration config;

    public Decodificador(Configuration c){
        this.config = c;
        this.peliculas = new ArrayList<Pelicula>();
        this.reproducidas = new ArrayList<Pelicula>();
    }

    public void setConfiguration(Configuration c){
        this.config = c;
    }

    public void reproduce(Pelicula p){
        this.reproducidas.add(p);
    }

    public void addMovie(Pelicula p){
        this.peliculas.add(p);
    }

    public List<Pelicula> sugerir(){
        return this.config.sugerir(this);
    }

    public List<Pelicula> getGrilla() {
        return new ArrayList<Pelicula>(this.peliculas);
    }

    public List<Pelicula> getReproducidas() {
        return new ArrayList<Pelicula>(this.reproducidas);
    }
    public List<Pelicula> noVistas(){
      return this.peliculas.stream()
                .filter(p -> !this.reproducidas.contains(p)).collect(Collectors.toList());
    }
}
