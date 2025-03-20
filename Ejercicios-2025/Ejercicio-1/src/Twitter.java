import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<User> users;

    public Twitter(){
        this.users = new ArrayList<User>();
    }

    public boolean addUser( String screenName){
        if (this.users.stream()
                .anyMatch(u -> u.isEqualName(screenName))
        )
           return false;
        return this.users.add(new User(screenName));
    }

    public boolean deleteUser(User user){
        if(user.deleteTweets())
            return this.users.remove(user);
        return false;
    }
    }

