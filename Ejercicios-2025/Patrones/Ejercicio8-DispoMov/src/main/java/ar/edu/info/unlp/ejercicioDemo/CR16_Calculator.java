package ar.edu.info.unlp.ejercicioDemo;

public class CR16_Calculator implements CR_Calculator{


    public int crcFor(String datos) {
            int crc = 0xFFFF;
            for (int j = 0; j < datos.getBytes().length; j++) {
                crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
                crc ^= (datos.getBytes()[j] & 0xff);
                crc ^= ((crc & 0xff) >> 4);
                crc ^= (crc << 12) & 0xffff;
                crc ^= ((crc & 0xFF) << 5) & 0xffff;
            }
            crc &= 0xffff;
            return Integer.valueOf(crc);
    }


}
