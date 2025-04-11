package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class InProgress extends Etapa{

    public InProgress(){
        super();
    }
    public void start(ToDoItem tdt) {}


    public void togglePause(ToDoItem tdt) {
        tdt.setState(new Paused());
    }


    public void finish(ToDoItem tdt) {
        tdt.setFinish();
        tdt.setState(new Finished());
    }


    public Duration workedTime(ToDoItem tdt) {
        return tdt.getFinished();
    }


    public void addComment(String c, ToDoItem tdt) {
        tdt.addAuxComment(c);
    }
}
