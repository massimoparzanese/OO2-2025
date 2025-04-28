package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
    private Connection conection;
    private CR_Calculator crcCalculator;
    private Ringer ringer;
    private Display display;

    public Dispositivo(CR_Calculator crc, Connection conec, Ringer ring, Display disp) {
        this.conection = conec;
        this.crcCalculator = crc;
        this.ringer = ring;
        this.display = disp;
    }

    public String send(String data){
        int aux = crcCalculator.crcFor(data);
        return this.conection.sendData(data, aux);
    }

    public void setCrcCalculator(CR_Calculator crc){
        this.crcCalculator = crc;
    }
    public String setConection(Connection c){
        this.conection = c;
        return this.ringer.ring() + this.conection.pict();
    }
}
