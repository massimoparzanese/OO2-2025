package ar.edu.unlp.info.oo1.GeneologiaSalvaje;

import java.time.LocalDate;

public class MamiferoDesconocido extends AbstractMamifero{

    public MamiferoDesconocido(){
        super("Identificador Desconocido", null);
        this.especie = "Desconocida";

    }
    public LocalDate getFechaNacimiento() {
        return null;
    }


    public AbstractMamifero getPadre() {
        return this;
    }


    public AbstractMamifero getMadre() {
        return this;
    }


    public AbstractMamifero getAbueloMaterno() {
        return this;
    }


    public AbstractMamifero getAbuelaMaterna() {
        return this;
    }


    public AbstractMamifero getAbueloPaterno() {
        return this;
    }


    public AbstractMamifero getAbuelaPaterna() {
        return this;
    }


    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return false;
    }
}
