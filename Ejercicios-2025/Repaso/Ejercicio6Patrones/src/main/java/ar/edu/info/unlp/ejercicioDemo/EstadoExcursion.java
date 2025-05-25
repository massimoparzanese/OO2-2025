package ar.edu.info.unlp.ejercicioDemo;

public abstract class EstadoExcursion {

    public abstract void add(Usuario user, Excursion exc);
    public abstract void remove(Usuario user, Excursion exc);

    public String obtenerInformacion(Excursion exc){
        return exc.getNombre() + " " +exc.getCosto() + exc.getFechaIni() + " " + exc.getFechaFin()
                +  " " +exc.getPuntoEncuentro() + this.adicional(exc);
    }

    public abstract String adicional(Excursion exc);
}
