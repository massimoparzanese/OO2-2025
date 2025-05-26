package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {

    private LocalDate fechaInicio;
    private double monto;
    private Prenda prenda;

    public Prestamo(LocalDate fechaInicio, double monto, Prenda prenda) {
        this.fechaInicio = fechaInicio;
        this.monto = monto;
        this.prenda = prenda;
    }

    public double calcularValorPrendario() {
        return prenda.calcularValorPrendario();
    }
    private double interesDiario(){
        return 0.03;
    }

    public long diasDesdeInicio() {
        return ChronoUnit.DAYS.between(this.fechaInicio, LocalDate.now());
    }

    public double montoTotalConInteres() {
        return this.monto + this.interesDiario();
    }

}
