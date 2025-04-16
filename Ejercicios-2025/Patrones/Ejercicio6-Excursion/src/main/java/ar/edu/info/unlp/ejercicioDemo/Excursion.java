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
    private State state;
    private List<Usuario> usuarios;
    private List<Usuario> espera;


    public Excursion(String nombre, LocalDate fechaIni, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.fechaFin = fechaFin;
        this.fechaIni = fechaIni;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.state = new Provisoria();
        this.usuarios = new ArrayList<Usuario>();
        this.espera = new ArrayList<Usuario>();
    }

    public String informacion() {
        return this.state.informacion(this);
    }

    public void addUser(Usuario u) {
        this.state.addUser(u, this);
    }

    public void removeUser(Usuario u) {
        this.state.removeUser(u, this);
    }
    // consultar tema si hacer asi o tener metodos auxiliares que aniadan a los usuarios
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public List<Usuario> getUsuariosEnEspera(){
        return this.espera;
    }
/*
    public void auxRemoveUser(Usuario u) {
        this.usuarios.remove(u);
    }

    public void auxAddUser(Usuario u) {
        this.usuarios.add(u);
    }

    public void addAuxUserWait(Usuario u) {
        this.espera.add(u);
    }

    public void auxRemoveUserWait(Usuario u) {
        this.espera.add(u);
    }
*/
    public void setState(State s){
        this.state = s;
    }
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
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
    public int cupoActual(){
        return this.usuarios.size();
    }

}
