package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.List;
import java.util.stream.Collectors;

public class AdapterJsonSimple extends VoorheesExporter{

    public AdapterJsonSimple(){

    }
    @Override
    public String exportar(List<Socio> socios){
        if(socios.isEmpty())
            return "[]";
        JSONArray array = new JSONArray();
        array.addAll(
                        socios.stream().map(socio -> {
                            JSONObject obj = new JSONObject();
                            obj.put("nombre", socio.getNombre());
                            obj.put("email", socio.getEmail());
                            obj.put("legajo", socio.getLegajo());
                            return obj;
                        }).collect(Collectors.toList())
        );
        return array.toJSONString();
    }
}
