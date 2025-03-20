public class Spock implements Elemento{
    @Override
    public String juegaContra(Elemento element) {
        return element.contraSpock();
    }

    @Override
    public String contraPiedra() {
        return "Gana Spock";
    }

    @Override
    public String contraPapel() {
        return "Gana Papel";
    }

    @Override
    public String contraTijera() {
        return "Gana Spock";
    }

    @Override
    public String contraSpock() {
        return "Empate";
    }

    @Override
    public String contraLagarto() {
        return "Gana Lagarto";
    }
}
