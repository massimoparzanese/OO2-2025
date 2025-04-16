package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String email;
    private String apellido;
    private List<Excursion> misExcursiones;

    public Usuario(String nombre, String ape, String email){
        this.nombre = nombre;
        this.apellido = ape;
        this.email = email;
        this.misExcursiones = new ArrayList<Excursion>();
    }

    public String getEmail(){
        return this.email;
    }

    public void addExcursion(Excursion e){
       this.misExcursiones.add(e);
        e.addUser(this);
    }

    public void darDeBaja(Excursion e){
        this.misExcursiones.remove(e);
        e.removeUser(this);
    }
}
