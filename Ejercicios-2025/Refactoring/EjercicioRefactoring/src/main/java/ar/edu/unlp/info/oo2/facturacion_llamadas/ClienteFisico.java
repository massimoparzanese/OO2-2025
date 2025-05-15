package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
    private String dni;

    public ClienteFisico(String nombre, String numero, String dni){
        super(nombre, numero);
        this.dni = dni;
    }

    public double descuento(){
        return 0;
    }

}