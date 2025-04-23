package ar.edu.info.unlp.ejercicioDemo;

public class Calculadora {

 private String valorAcumulado;
 private State state;
 public Calculadora(){
     this.valorAcumulado = "0";
     this.state = new Initial();
 }
public void borrar(){
     this.state = new Initial();
}
 public String getResultado(){
     return this.state.getResultado(this);
 }

 public void setValor(double unValor){
     this.state.operar(this, unValor);
 }
 public void setValorAcumulado(String unValor){
     this.valorAcumulado = unValor;
 }
 public void mas(){
     this.state.mas(this);
 }
 public void menos(){
        this.state.menos(this);
 }
 public void por(){
        this.state.por(this);
 }
 public void dividir(){
        this.state.dividir(this);
 }
 public String getValorAcumulado(){
     return this.valorAcumulado;
 }
 public void setState(State s){
     this.state = s;
 }

}
