package ar.edu.info.unlp.ejercicioDemo;

public class Provisoria extends EstadoExcursion{


    public void add(Usuario user, Excursion exc) {
        exc.getUsuarios().add(user);
        if(exc.cantUsuarios() == exc.getCupoMin())
            exc.setEstado(new Definitiva());
    }


    public void remove(Usuario user, Excursion exc) {
        exc.getUsuarios().remove(user);
    }


    public String adicional(Excursion exc) {
        return " y faltan " + (exc.getCupoMin() - exc.cantUsuarios()) + " Usuarios";
    }
}
