package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente{
    private String cuit;

    public ClienteJuridico(String nombre, String numero, String cuit){
        super(nombre, numero);
        this.cuit = cuit;
    }

    public double descuento(){
        return 0.15;
    }

}