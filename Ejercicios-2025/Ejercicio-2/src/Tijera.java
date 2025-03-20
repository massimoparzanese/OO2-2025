public class Tijera implements Elemento{
    @Override
    public String juegaContra(Elemento element) {
        return element.contraTijera();
    }

    @Override
    public String contraPiedra() {
        return "Gana Piedra";
    }

    @Override
    public String contraPapel() {
        return "Gana Tijera";
    }

    @Override
    public String contraTijera() {
        return "Empate";
    }

    @Override
    public String contraSpock() {
        return "Gana Spock";
    }

    @Override
    public String contraLagarto() {
        return "Gana Tijera";
    }
}
