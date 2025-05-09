package ar.edu.unlp.info.oo1.GeneologiaSalvaje;

import java.time.LocalDate;

public abstract class AbstractMamifero {

    protected String identificador;
    protected String especie;
    protected LocalDate fechaNacimiento;
    protected AbstractMamifero padre;
    protected AbstractMamifero madre;

    public AbstractMamifero(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public AbstractMamifero(String id, LocalDate fechaNacimiento){
        this.identificador = id;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificador() {
        return this.identificador;
    }
    public void setIdentificador(String identificador) {}

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {}

    public abstract LocalDate getFechaNacimiento();

    public void setFechaNacimiento(LocalDate fechaNacimiento) {}
    public abstract AbstractMamifero getPadre();

    public void setPadre(Mamifero padre) {

    }
    public abstract AbstractMamifero getMadre();

    public void setMadre(Mamifero madre) {}

    public abstract AbstractMamifero getAbueloMaterno();

    public abstract AbstractMamifero getAbuelaMaterna();

    public abstract AbstractMamifero getAbueloPaterno();

    public abstract AbstractMamifero getAbuelaPaterna();


    public abstract boolean tieneComoAncestroA(Mamifero unMamifero);
}
