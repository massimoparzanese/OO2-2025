package ar.edu.info.unlp.ejercicioDemo;

public class CuatroGAdapter implements Connection{
    private CuatroGConnection cuatroGConect;

    public String sendData(String data, int crc) {
        return cuatroGConect.transmit(data, crc);
    }


    public String pict() {
        return cuatroGConect.getSymb();
    }
}
