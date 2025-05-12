package ar.edu.unlp.oo2.persitencia;

import java.util.ArrayList;
import java.util.List;

public class VirtualUserProxy implements PersistableUser{

    private String username;
    private String email;
    private User realUser;
    private PostRepository repo;

    public VirtualUserProxy (String aUsername, String anEmail) {
        this.username = aUsername;
        this.email = anEmail;
    }
    private void initialize() {
        if (realUser == null) {
            realUser = new User(this.username, this.email);
            List<Post> posts = repo.findPostsByUsername(username);
            realUser.addPosts(posts);
        }
    }

    public String getUsername() {
        return this.username;
    }


    public String getEmail() {
        return this.email;
    }


    public String toString() {
        return this.username + " - " + this.email;
    }


    public List<Post> getPosts() {
        initialize();
        return realUser.getPosts();
    }
}
