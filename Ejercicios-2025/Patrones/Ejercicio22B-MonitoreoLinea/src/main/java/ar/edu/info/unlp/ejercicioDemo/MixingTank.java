package ar.edu.info.unlp.ejercicioDemo;

import java.util.Map;

public class MixingTank {

    private int temperature = 20;
    private double liquidLevel = 100;
    private int heatPower = 0;
    private int mixerPower = 0;

    public boolean heatPower(int percentage) {
        if (percentage < 0 || percentage > 100) return false;
        this.heatPower = percentage;
        return true;
    }

    public boolean mixerPower(int percentage) {
        if (percentage < 0 || percentage > 100) return false;
        this.mixerPower = percentage;
        return true;
    }
    public double upTo() {
        return this.liquidLevel;
    }

    public int temperature() {
        return this.temperature;
    }
    public void delay(int seconds) {
        this.temperature += getHeatIncreasePerSecond(heatPower) * seconds;;
    }
    // Esto hay que cambiarlo
    private int getHeatIncreasePerSecond(int power) {
        if (power >= 100) return 5;
        if (power >= 75)  return 4;
        if (power >= 50)  return 2;
        if (power >= 25)  return 1;
        return 0;
    }

    // Métodos de utilidad para los tests
    public void setTemperature(int t) {
        this.temperature = t;
    }

    public void setLiquidLevel(int l) {
        this.liquidLevel = l;
    }

    public boolean purge() {
        try {
            Thread.sleep(4000); // simula 4 segundos
        } catch (InterruptedException e) {
            return false;
        }
        this.liquidLevel = 0;
        return true;
    }

}
