package ar.edu.info.unlp.ejercicioDemo;

public abstract class State {
    public String informacion(Excursion e){
        return e.getNombre() + " " + e.getCosto() + " " +e.getFechaIni() + " " + e.getFechaFin()
                + " " + e.getPuntoEncuentro() + this.adicional(e);
    }
    public abstract void addUser(Usuario u, Excursion e);
    public abstract void removeUser(Usuario u, Excursion e);
    public abstract String adicional(Excursion e);

}
