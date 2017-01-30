package domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by emile on 30-1-2017.
 */
public class Post {
    private String title;
    private String content;
    private ArrayList<Comment> comments;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addComment(Comment comment)
    {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", comments=" + comments.toString() +
                '}';
    }
}
