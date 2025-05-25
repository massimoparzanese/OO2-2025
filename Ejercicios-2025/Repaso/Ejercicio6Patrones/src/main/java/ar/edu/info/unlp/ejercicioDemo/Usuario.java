package ar.edu.info.unlp.ejercicioDemo;

public class Usuario {

    private String nombre;
    private String apellido;
    private String email;

    public Usuario(String nom,String ape, String email){
        this.nombre = nom;
        this.apellido= ape;
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}
