package ar.edu.info.unlp.ejercicioDemo;

public class LightMix extends ProcessStep{

    protected boolean basicExecute(MixingTank tank) {
        int tempBefore = tank.temperature();
        tank.heatPower(100);
        tank.delay(2);
        if (tank.temperature() - tempBefore == 10) {
        tank.mixerPower(5);
        return true;
    }
        return false;
}
}
