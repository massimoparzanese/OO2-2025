package ar.edu.info.unlp.ejercicioDemo;

public class Llena extends EstadoExcursion{

    public void add(Usuario user, Excursion exc) {
        exc.getEnEspera().add(user);
    }


    public void remove(Usuario user, Excursion exc) {
        if(exc.getUsuarios().contains(user)){
            exc.getUsuarios().remove(user);
            if(!exc.getEnEspera().isEmpty()){
                exc.getUsuarios().add(exc.getEnEspera().remove(0));
            }
            else{
                exc.setEstado(new Definitiva());
            }
        }
        else{
            exc.getEnEspera().remove(user);
        }
    }


    public String adicional(Excursion exc) {
        return "";
    }
}
