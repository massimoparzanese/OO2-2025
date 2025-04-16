package ar.edu.info.unlp.ejercicioDemo;

public class Llena extends State{

    public Llena(){}

    public void addUser(Usuario u, Excursion e) {
        e.getUsuariosEnEspera().add(u);
    }


    public void removeUser(Usuario u, Excursion e) {
        if(e.getUsuariosEnEspera().contains(u)){
            e.getUsuariosEnEspera().remove(u);
        }
        else{
            e.getUsuarios().remove(u);
            if(e.getUsuariosEnEspera().isEmpty()){
                e.setState(new Definitiva());
            }
            else {
                Usuario user = e.getUsuariosEnEspera().get(0);
                e.getUsuarios().add(user);
                e.getUsuariosEnEspera().remove(user);
            }
        }
    }


    public String adicional(Excursion e) {
        return "";
    }
}
