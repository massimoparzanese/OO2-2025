package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LightMixTest {
    private LightMix lightMix;
    private MixingTank stub;
    @BeforeEach
    void setUp() throws Exception {
        lightMix = new LightMix();
        stub = new MixingTank();
    }

    @Test
    void testExecute () {
        lightMix.execute(stub);
        assertTrue(lightMix.isDone());
        stub.setHeatPowerResult(true);
        stub.setMixerPowerResult(false); // falla la mezcladora
        lightMix.execute(stub);
        assertFalse(lightMix.isDone());
        stub.setHeatPowerResult(false); // falla la config del nivel de potencia
        stub.setMixerPowerResult(true);
        lightMix.execute(stub);
        assertFalse(lightMix.isDone());
        stub.setHeatPowerResult(false);
        stub.setMixerPowerResult(false);
        lightMix.execute(stub);
        assertFalse(lightMix.isDone());
    }
    }
