public class Lagarto implements Elemento{
    @Override
    public String juegaContra(Elemento element) {
        return element.contraLagarto();
    }

    @Override
    public String contraPiedra() {
        return "Gana Piedra";
    }

    @Override
    public String contraPapel() {
        return "Gana Lagarto";
    }

    @Override
    public String contraTijera() {
        return "Gana Tijera";
    }

    @Override
    public String contraSpock() {
        return "Gana Lagarto";
    }

    @Override
    public String contraLagarto() {
        return "Empate";
    }
}
