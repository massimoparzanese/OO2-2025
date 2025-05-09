package ar.edu.info.unlp.ejercicioDemo;

public class MixingTank {

    private boolean heatPowerResult = true;
    private boolean mixerPowerResult = true;
    private boolean purgeResult = true;

    // Métodos para configurar el comportamiento en el test
    public void setHeatPowerResult(boolean result) {
        this.heatPowerResult = result;
    }

    public void setMixerPowerResult(boolean result) {
        this.mixerPowerResult = result;
    }

    public void setPurgeResult(boolean result) {
        this.purgeResult = result;
    }


    public boolean heatPower(int percentage) {
        return heatPowerResult;
    }


    public boolean mixerPower(int percentage) {
        return mixerPowerResult;
    }


    public boolean purge() {
        return purgeResult;
    }
}
