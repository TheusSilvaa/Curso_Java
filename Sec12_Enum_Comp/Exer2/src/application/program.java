package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip! ");
        Comment c2 = new Comment("Wow that's awesome! ");
        Post p1 = new Post(
                sdf.parse("21/06/2026 13:05:45"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Have a nice trip! ");
        Comment c4 = new Comment("Wow that's awesome! ");
        Post p2 = new Post(
                sdf.parse("28/04/2026 13:05:45"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
