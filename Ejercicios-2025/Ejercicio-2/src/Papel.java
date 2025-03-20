public class Papel implements Elemento{
    @Override
    public String juegaContra(Elemento element) {
        return element.contraPapel();
    }

    @Override
    public String contraPiedra() {
        return "Gana Papel";
    }

    @Override
    public String contraPapel() {
        return "Empate";
    }

    @Override
    public String contraTijera() {
        return "Gana Tijera";
    }

    @Override
    public String contraSpock() {
        return "Gana Papel";
    }

    @Override
    public String contraLagarto() {
        return "Gana Lagarto";
    }
}
