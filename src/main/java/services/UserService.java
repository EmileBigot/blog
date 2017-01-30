package services;

import domain.Comment;
import domain.Post;
import domain.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();

    public User registerUser(String username, String password, String name)
    {
        User user = new User(name, username, password);
        users.add(user);
        return user;
    }

    public User loginUser(String username, String password)
    {
        for (User u : users)
        {
            if(u.getUsername().equals(username) && u.getPassword().equals(password))
            {
                return u;
            }
        }
        return null;
    }

    public String postBlog(String title, String content, String username)
    {
        Post post = null;
        for(User u : users)
        {
            if(u.getUsername().equals(username))
            {
                post = new Post(title, content);
                u.addPosts(post);
            }
        }

        if(post != null)
        {
            return post.toString();
        } else {
            return "Something went wrong!";
        }
    }

    public String commentOnBlog(String postTitle, String comment, String username)
    {
        Post postForComment = null;
        User user = null;
        for(User u : users)
        {
            for (Post post : u.getPosts())
            {
                if (post.getTitle().equals(postTitle))
                {
                    postForComment = post;
                }
            }
            if(u.getUsername().equals(username))
            {
                user = u;
            }
        }
        if(user != null && postForComment != null)
        {
            postForComment.addComment(new Comment(user, comment));
            return postForComment.toString();
        } else {
            return "Something went wrong";
        }
    }

    public ArrayList<User> getAllUsers() {
        return users;
    }

    public ArrayList<Post> getAllPosts()
    {
        ArrayList<Post> posts = new ArrayList<>();
        for(User u : users)
        {
            for(Post p : u.getPosts())
            {
                posts.add(p);
            }
        }
        return posts;
    }
}