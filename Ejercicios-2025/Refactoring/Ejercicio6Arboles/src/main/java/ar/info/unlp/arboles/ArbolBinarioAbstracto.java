package ar.info.unlp.arboles;

public abstract class ArbolBinarioAbstracto {

protected int valor;

protected ArbolBinarioAbstracto hijoIzquierdo;

protected ArbolBinarioAbstracto hijoDerecho ;

  


public ArbolBinarioAbstracto(int valor){
	this.valor = valor;
}
  

public int getValor() {

return valor;

}

  

public void setValor(int valor) {

this.valor = valor;

}

  

public ArbolBinarioAbstracto getHijoIzquierdo() {

return hijoIzquierdo;

}

  

public void setHijoIzquierdo(ArbolBinarioAbstracto hijoIzquierdo) {

this.hijoIzquierdo = hijoIzquierdo;

}

  

public ArbolBinarioAbstracto getHijoDerecho() {

return hijoDerecho;

}

  

public void setDerecha(ArbolBinarioAbstracto hijoDerecho) {

this.hijoDerecho = hijoDerecho;

}

  public abstract String recorrerPreorden();
  public abstract String recorrerPostorden();
  public abstract String recorrerInorden();


}
