package ar.edu.info.unlp.ejercicioDemo;

public class Purge extends ProcessStep{

    protected boolean basicExecute(MixingTank tank) {
        return (tank.heatPower(0)
                && tank.mixerPower(0)
                && tank.purge());
    }
}
