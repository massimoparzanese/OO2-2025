public class ReTweet implements Post{

    private Tweet origin;

    public ReTweet (Tweet origin){
        this.origin = origin;
    }

    @Override
    public boolean eliminar() {
        this.origin = null;
        return true;
    }
}
