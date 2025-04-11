package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Finished extends Etapa{

    public Finished(){
        super();
    }
    public void start(ToDoItem tdt) {}


    public void togglePause(ToDoItem tdt) {
        throw new RuntimeException("No se puede pausar un item finalizado");
    }


    public void finish(ToDoItem tdt) {}

    public Duration workedTime(ToDoItem tdt) {
        return tdt.getFinished();
    }


    public void addComment(String c, ToDoItem tdt) {}
}
