package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterJsonSimpleTest {

    AdapterJsonSimple adapJson;
    List<Socio> socios;
    Socio s1;
    @BeforeEach
    void setUp() throws Exception{
        s1 = new Socio("Juan Roche", "rochejuanandres@gmail.com", "26252/1");
        adapJson = new AdapterJsonSimple();
        socios = new ArrayList<Socio>();
        socios.add(s1);
    }

    @Test
    void testExportar() throws ParseException {
        String jsonEsperado = "[{\"nombre\":\"Juan Roche\",\"email\":\"rochejuanandres@gmail.com\",\"legajo\":\"26252/1\"}]";
        JSONParser parser = new JSONParser();
        JSONArray esperado = (JSONArray) parser.parse(jsonEsperado);
        JSONArray actual = (JSONArray) parser.parse(adapJson.exportar(socios));
        assertEquals(esperado, actual);
        socios.clear();
        assertEquals("[]", adapJson.exportar(socios));
    }

}


