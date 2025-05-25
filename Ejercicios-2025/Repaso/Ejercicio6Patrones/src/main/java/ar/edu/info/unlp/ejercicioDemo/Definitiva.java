package ar.edu.info.unlp.ejercicioDemo;

import java.util.stream.Collectors;

public class Definitiva extends EstadoExcursion{

    public void add(Usuario user, Excursion exc) {
        exc.getUsuarios().add(user);
        if(exc.cantUsuarios() == exc.getCupoMax())
            exc.setEstado(new Llena());
    }


    public void remove(Usuario user, Excursion exc) {
        exc.getUsuarios().remove(user);
        if(exc.cantUsuarios() < exc.getCupoMin())
            exc.setEstado(new Provisoria());

    }


    public String adicional(Excursion exc) {
        return " los usuarios que tenemos son" + exc.getUsuarios().stream()
                .map(u -> u.getEmail())
                .collect(Collectors.joining("\n"))
                + " y para el cupo max faltan " + (exc.getCupoMax() - exc.cantUsuarios());
    }
}
