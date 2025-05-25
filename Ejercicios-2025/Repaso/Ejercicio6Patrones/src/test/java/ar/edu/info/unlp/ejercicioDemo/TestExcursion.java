package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExcursion {

    private Excursion excursion;
    private EstadoExcursion estado;
    private Usuario us1;
    private Usuario us2;
    private Usuario us3;
    private String infoBasica;


    @BeforeEach
    void setUp() throws Exception {
        excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now(), LocalDate.now(),100, " La mielda ",1, 2);
        us1 = new Usuario("Massi", "Parzanese", "massi@gmail.com");
        us2 = new Usuario("Andi","Rouch","andirouch@gmail.com");
        us3 = new Usuario("pedro","robinardo","bombas@gmail.com");
        excursion.inscribir(us1);
        excursion.inscribir(us2);
        infoBasica = excursion.getNombre() + " " +excursion.getCosto() + excursion.getFechaIni() + " "
                + excursion.getFechaFin() +  " " + excursion.getPuntoEncuentro();
    }


    @Test
    void testGetInformacion(){
        String informacion  = infoBasica;
        excursion.inscribir(us3);
        assertEquals(excursion.obtenerInformacion(), informacion);
        excursion.darDeBaja(us2);
        assertEquals(excursion.obtenerInformacion(), informacion);
        excursion.darDeBaja(us3);
        informacion += " los usuarios que tenemos son" + excursion.getUsuarios().stream()
                .map(u -> u.getEmail())
                .collect(Collectors.joining("\n"))
                + " y para el cupo max faltan " + (excursion.getCupoMax() - excursion.cantUsuarios());
        assertEquals(excursion.obtenerInformacion(), informacion);
        informacion = infoBasica;
        excursion.darDeBaja(us1);
        informacion += " y faltan " + (excursion.getCupoMin() - excursion.cantUsuarios()) + " Usuarios";
        assertEquals(excursion.obtenerInformacion(), informacion);
    }
}
