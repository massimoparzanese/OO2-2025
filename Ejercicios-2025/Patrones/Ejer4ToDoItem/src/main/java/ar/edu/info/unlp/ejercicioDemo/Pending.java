package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Pending extends Etapa{

    public Pending(){
        super();
    }

    public void start(ToDoItem tdt) {
        tdt.setState(new InProgress());
        tdt.setInicio();
    }


    public void togglePause(ToDoItem tdt) {
        throw new RuntimeException("No se puede pausar un itemPendiente");
    }


    public void finish(ToDoItem tdt) {}


    public Duration workedTime(ToDoItem tdt) {
        throw new RuntimeException("El item no fue iniciado, no se le puede pedir el item");
    }


    public void addComment(String c, ToDoItem tdt) {
        tdt.addAuxComment(c);
    }
}
