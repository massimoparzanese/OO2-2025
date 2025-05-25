package ar.info.unlp.arboles;



public class NullArbolBinario extends ArbolBinarioAbstracto {

	public NullArbolBinario(int valor) {	
		super(valor);
	}  
	
	public int getValor() {
	
	return valor;
	
	}
	
	  
	@Override
	public void setValor(int valor) {}
	
	  
	@Override
	public ArbolBinarioAbstracto getHijoIzquierdo() {
	
	return this;
	
	}
	
	  
	@Override
	public void setHijoIzquierdo(ArbolBinarioAbstracto hijoIzquierdo) {}
	
	  
	@Override
	public ArbolBinarioAbstracto getHijoDerecho() {
	
	return this;
	
	}
	
	  
	@Override
	public void setDerecha(ArbolBinarioAbstracto hijoDerecho) {}
	
	
	public String recorrerPreorden(){
	return "";
	}
	  public String recorrerPostorden(){
	  return "";}
	  public String recorrerInorden(){
	  return "";}
}

