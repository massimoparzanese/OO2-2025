package ar.edu.info.unlp.ejercicioDemo;

public class Provisoria extends State{


    public Provisoria(){}

    public void addUser(Usuario u, Excursion e) {

        e.getUsuarios().add(u);
        // A mi parecer esto es envidia de atributos, aunque deberia consultarse
        // podria ser un metodo en excursion que devuelva true en esa condicion y ya
        if(e.cupoActual() == e.getCupoMin())
            e.setState(new Definitiva());
    }

    public void removeUser(Usuario u, Excursion e) {
            e.getUsuarios().add(u);
    }

    public String adicional(Excursion e) {
        return "y faltan " + (e.getCupoMin() - e.cupoActual()) + " usuarios para llenar la excursion";
    }
}
