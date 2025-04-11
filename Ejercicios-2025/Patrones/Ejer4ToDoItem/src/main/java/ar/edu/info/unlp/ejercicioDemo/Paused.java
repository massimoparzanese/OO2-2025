package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class Paused extends Etapa{

    public Paused(){
        super();
    }

    public void start(ToDoItem tdt) {}


    public void togglePause(ToDoItem tdt) {
        tdt.setState(new InProgress());
    }


    public void finish(ToDoItem tdt) {
        tdt.setFinish();
        tdt.setState(new Finished());
    }


    public Duration workedTime(ToDoItem tdt) {
       return tdt.getFinished();
    }


    public void addComment(String c, ToDoItem tdt) {

    }
}
