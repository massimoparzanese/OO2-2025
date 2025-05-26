package ar.edu.info.unlp.ejercicioDemo;

public class Componente {

    private String descripcion;
    private String nombre;
    private double consumo;
    private double precio;

    public Componente(String nombre, String descripcion, double consumo, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.consumo = consumo;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getPrecio() {
        return precio;
    }
}
