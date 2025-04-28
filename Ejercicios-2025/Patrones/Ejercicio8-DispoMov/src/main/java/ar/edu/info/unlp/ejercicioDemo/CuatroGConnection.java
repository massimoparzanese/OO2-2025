package ar.edu.info.unlp.ejercicioDemo;

public class CuatroGConnection {
    private String simb;

    public CuatroGConnection(String simb){
        this.simb = simb;
    }
    public String transmit(String data, int crc){
        return data;
    }

    public String getSymb(){
        return simb;
    }
}
