package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public abstract class Etapa {

    public Etapa(){}

    public abstract void start(ToDoItem tdt);

    public abstract void togglePause(ToDoItem tdt);

    public abstract void finish(ToDoItem tdt);

    public abstract Duration workedTime(ToDoItem tdt);

    public abstract void addComment(String c, ToDoItem tdt);

}
