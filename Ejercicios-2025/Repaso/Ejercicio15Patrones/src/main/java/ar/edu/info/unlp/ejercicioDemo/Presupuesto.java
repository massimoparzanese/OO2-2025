package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;
public class Presupuesto {

    private String nombre;
    private LocalDate fechaSolicitud;
    private Equipo equipo;

    public Presupuesto(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.fechaSolicitud = LocalDate.now();
        this.equipo = equipo;
    }

    public double calcularPrecio(){
        return this.equipo.calcularPrecio();
    }
}
