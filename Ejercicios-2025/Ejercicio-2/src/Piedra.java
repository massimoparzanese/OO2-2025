public class Piedra implements Elemento{
    @Override


    public String juegaContra(Elemento element) {
        return element.contraPiedra();
    }
;
    @Override
    public String contraPiedra() {
        return "Empate";
    }

    @Override
    public String contraPapel() {
        return "Gana Papel";
    }

    @Override
    public String contraTijera() {
        return "Gana Piedra";
    }

    @Override
    public String contraSpock() {
        return "Gana Spock";
    }

    @Override
    public String contraLagarto() {
        return "Gana Piedra";
    }
}
