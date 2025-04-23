package ar.edu.unlp.info.oo2.biblioteca;


import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    Socio s1;
    Socio s2;
    VoorheesExporter vh;
    Biblioteca b1;
    Biblioteca b2;
    AdapterJsonSimple adapJson;
    @BeforeEach
    void setUp() throws Exception{
        s1 = new Socio("Juan Roche", "rochejuanandres@gmail.com", "26252/1");
        s2 = new Socio("Massimo Parzanese", "massi@gmail.com", "24252/1");
        vh = new VoorheesExporter();
        b1 = new Biblioteca();
        b2 = new Biblioteca();
        b1.agregarSocio(s1);
        b1.agregarSocio(s2);
        adapJson = new AdapterJsonSimple();
    }

    @Test
    void testExportar() throws ParseException {
        String json = "[{\"nombre\":\"JuanRoche\",\"email\":\"rochejuanandres@gmail.com\",\"legajo\":\"26252/1\"},{\"nombre\":\"MassimoParzanese\",\"email\":\"massi@gmail.com\",\"legajo\":\"24252/1\"}]";
        assertEquals("[]", b2.exportarSocios());
        assertEquals(json, b1.exportarSocios().replaceAll("\\s", ""));
        b1.setExporter(adapJson);
        b2.setExporter(adapJson);
        json = "[{\"nombre\":\"Juan Roche\",\"email\":\"rochejuanandres@gmail.com\",\"legajo\":\"26252/1\"},{\"nombre\":\"Massimo Parzanese\",\"email\":\"massi@gmail.com\",\"legajo\":\"24252/1\"}]";
        JSONParser parser = new JSONParser();
        JSONArray esperado = (JSONArray) parser.parse(json);
        JSONArray actual = (JSONArray) parser.parse(b1.exportarSocios());
        assertEquals(esperado, actual);
        assertEquals("[]", b2.exportarSocios());
    }


}
