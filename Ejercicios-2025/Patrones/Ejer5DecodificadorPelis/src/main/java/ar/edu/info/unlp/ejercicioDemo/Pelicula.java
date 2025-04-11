package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String titulo;
    private int anioEst;
    private int puntaje;
    private List<Pelicula> similares;


    public Pelicula(String t, int anioEst, int p){
        this.titulo = t;
        this.anioEst = anioEst;
        this.puntaje = p;
        this.similares = new ArrayList<Pelicula>();
    }

    public Boolean esSimilar(Pelicula p){
        return this.similares.stream().anyMatch( peli -> peli == p);
    }

    public void addSimilar(Pelicula p){
        this.similares.add(p);
    }

    public int compareAnio(int anioEst){
        if (this.anioEst > anioEst)
            return -1; // más reciente primero
        else if (this.anioEst == anioEst)
            return 0;
        return 1;
    }

    public int getAnioEst(){
        return this.anioEst;
    }

    public int comparePuntaje(int p){
        if(this.puntaje > p)
            return -1;
        else if (this.puntaje == p)
            return 0;
        return 1;
    }

    public int getPuntaje() {
        return this.puntaje;
    }
}
