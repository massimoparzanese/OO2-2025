package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurgeTest {

    private Purge purge;
    private MixingTank stub;
    @BeforeEach
    void setUp() throws Exception {
        purge = new Purge();
        stub = new MixingTank();
    }

    @Test
    void testExecute () {
        // primer caso
        purge.execute(stub);
        assertTrue(purge.isDone());
        // segundo caso
        stub.setHeatPowerResult(true);
        stub.setMixerPowerResult(true);
        stub.setPurgeResult(false);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // tercer caso
        stub.setHeatPowerResult(true);
        stub.setMixerPowerResult(false);
        stub.setPurgeResult(true);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // cuarto caso
        stub.setHeatPowerResult(true);
        stub.setMixerPowerResult(false);
        stub.setPurgeResult(false);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // quinto caso
        stub.setHeatPowerResult(false);
        stub.setMixerPowerResult(true);
        stub.setPurgeResult(true);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // sexto caso
        stub.setHeatPowerResult(false);
        stub.setMixerPowerResult(true);
        stub.setPurgeResult(false);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // septimo caso
        stub.setHeatPowerResult(false);
        stub.setMixerPowerResult(false);
        stub.setPurgeResult(true);
        purge.execute(stub);
        assertFalse(purge.isDone());
        // octavo caso
        stub.setHeatPowerResult(false);
        stub.setMixerPowerResult(false);
        stub.setPurgeResult(false);
        purge.execute(stub);
        assertFalse(purge.isDone());
    }
}
