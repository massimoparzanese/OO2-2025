package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoorheesExporterTest {

    VoorheesExporter vh;
    List<Socio> socios;
    Socio s1;
    @BeforeEach
    void setUp() throws Exception{
        s1 = new Socio("Juan Roche", "rochejuanandres@gmail.com", "26252/1");
        vh = new VoorheesExporter();
        socios = new ArrayList<Socio>();
        socios.add(s1);
    }

    @Test
    void testExportar(){
        String json = "[{\"nombre\":\"JuanRoche\",\"email\":\"rochejuanandres@gmail.com\",\"legajo\":\"26252/1\"}]";
        assertEquals(json, vh.exportar(socios).replaceAll("\\s", ""));
        socios.clear();
        assertEquals("[]", vh.exportar(socios));
    }

}
