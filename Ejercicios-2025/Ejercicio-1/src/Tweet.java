public class Tweet implements Post{
    private String message;

    public Tweet(String message){
        this.message = message;
    }
    @Override
    public boolean eliminar() {
        return true;
    }

    public static boolean isValidLength(String text){
        return(text.length() >= 1 && text.length() <= 280);
    }


}
