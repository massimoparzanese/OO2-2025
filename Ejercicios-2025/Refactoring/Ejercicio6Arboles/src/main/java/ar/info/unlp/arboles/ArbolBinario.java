package ar.info.unlp.arboles;

public class ArbolBinario extends ArbolBinarioAbstracto {


public ArbolBinario(int valor) {

super(valor);
this.hijoDerecho = new NullArbolBinario(0);
this.hijoIzquierdo = new NullArbolBinario(0);

}  
public String recorrerPreorden() {

String resultado = valor + " - ";
resultado += this.getHijoIzquierdo().recorrerPreorden();
resultado += this.getHijoDerecho().recorrerPreorden();
return resultado;

}

  

public String recorrerInorden() {

String resultado = "";
resultado += this.getHijoIzquierdo().recorrerInorden();
resultado += valor + " - ";
resultado += this.getHijoDerecho().recorrerInorden();

return resultado;

}

  

public String recorrerPostorden() {

String resultado = "";
resultado += this.getHijoIzquierdo().recorrerPostorden();
resultado += this.getHijoDerecho().recorrerPostorden();

resultado += valor + " - ";

return resultado;

}




}

