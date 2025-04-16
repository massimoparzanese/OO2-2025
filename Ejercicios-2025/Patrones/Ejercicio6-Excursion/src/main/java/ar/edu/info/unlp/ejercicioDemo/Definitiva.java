package ar.edu.info.unlp.ejercicioDemo;

import java.util.stream.Collectors;

public class Definitiva extends State{

   public Definitiva(){}

    public void addUser(Usuario u, Excursion e) {
        if(e.cupoActual() == e.getCupoMax()){
            e.getUsuariosEnEspera().add(u);
            e.setState(new Llena());
        }
        else {
            e.getUsuarios().add(u);
        }
    }


    public void removeUser(Usuario u, Excursion e) {
        e.getUsuarios().remove(u);
        if(e.getUsuarios().size() < e.getCupoMin())
            e.setState(new Provisoria());
    }


    public String adicional(Excursion e) {
        return " Los inscriptos son " + e.getUsuarios().stream().map(u -> "- " + u.getEmail())
                .collect(Collectors.joining("\n"))
                + " y faltan " + (e.getCupoMax() - e.cupoActual()) + " usuarios para completar " ;
    }
}
