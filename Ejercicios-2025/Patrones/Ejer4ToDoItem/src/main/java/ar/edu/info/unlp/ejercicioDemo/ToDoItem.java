package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

    private List<String> comments;
    private String nombre;
    private LocalDate inicio;
    private Etapa state;
    private LocalDate fin;
    public ToDoItem(String nombre){
        this.nombre = nombre;
        this.state = new Pending();
        this.comments = new ArrayList<String>();
    }

    public void start(){
        this.state.start(this);
    }

    public void togglePause(){
        this.state.togglePause(this);
    }

    public void finish(){
        this.state.finish(this);
    }

    public Duration workedTime(){
        return this.state.workedTime(this);
    }

    public void addComment(String comment){
        this.state.addComment(comment, this);
    }

    public void setState(Etapa e){
        this.state = e;
    }

    public void addAuxComment(String c){
        this.comments.add(c);
    }

    public void setInicio() {
        this.inicio = LocalDate.now();
    }

    public LocalDate getInicio() {
        return this.inicio;
    }
    public void setFinish(){
        this.fin = LocalDate.now();
    }

    public Duration getFinished(){
        return Duration.between(this.inicio, this.fin != null ? this.fin : LocalDate.now());
    }
}
