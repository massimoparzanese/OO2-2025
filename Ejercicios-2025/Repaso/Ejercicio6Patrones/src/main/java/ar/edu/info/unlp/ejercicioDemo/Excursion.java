package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMin;
    private int cupoMax;
    private List<Usuario> usuarios;
    private List<Usuario> enEspera;
    private EstadoExcursion estado;


    public Excursion(String nom,LocalDate fechaI, LocalDate fechaF, double c, String punto,int cupoMin, int cupoMax){
        this.nombre = nom;
        this.fechaIni = fechaI;
        this.fechaFin = fechaF;
        this.costo = c;
        this.puntoEncuentro = punto;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.usuarios = new ArrayList<Usuario>();
        this.enEspera = new ArrayList<Usuario>();
        this.estado = new Provisoria();
    }
    public int cantUsuarios(){
        return this.usuarios.size();
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public int getCupoMin() {
        return cupoMin;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Usuario> getEnEspera() {
        return enEspera;
    }
    public void inscribir(Usuario user){
        this.estado.add(user, this);
    }
    public void darDeBaja(Usuario user){
        this.estado.remove(user, this);
    }

    public String obtenerInformacion(){
       return this.estado.obtenerInformacion(this);
    }
    public void setEstado(EstadoExcursion est){
        this.estado = est;
    }
}
