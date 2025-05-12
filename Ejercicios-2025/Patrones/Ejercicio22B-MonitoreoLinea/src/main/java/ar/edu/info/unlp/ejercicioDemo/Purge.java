package ar.edu.info.unlp.ejercicioDemo;

public class Purge extends ProcessStep{

    protected boolean basicExecute(MixingTank tank) {
        if (tank.upTo() == 0) return false;
        tank.heatPower(0);
        tank.mixerPower(0);
        tank.purge();
        if (tank.upTo() != 0) return false;
        return true;
    }
}
