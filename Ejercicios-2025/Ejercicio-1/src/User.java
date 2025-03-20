import java.util.ArrayList;
import java.util.List;
public class User {

    private String screenName;
    private List<Post> tweets;

    public User(String screenName){
        this.screenName = screenName;
        this.tweets = new ArrayList<Post>();
    }

    public Post postTweet(String message){
        if(Tweet.isValidLength(message)) {
            Post tweet = new Tweet(message);
            this.tweets.add(tweet);
            return tweet;
        }
        return null;
    }

    public Post postReTweet(Tweet origin){
        Post reTweet = new ReTweet(origin);
        this.tweets.add(reTweet);
        return reTweet;
    }

    public boolean deleteTweets(){
        this.tweets.stream().forEach(t -> t.eliminar());
        this.tweets.clear();
        return true;
    }
    public boolean isEqualName(String name){
        return (name.equals(screenName));
    }
}
