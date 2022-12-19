package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        //7.1 module task
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("An example of text", text -> "-|- " + text + " -|-");
        poemBeautifier.beautify("An example of text", text -> {
            String str = new String(text);
            text = str.toUpperCase();
            return text;
        });
        poemBeautifier.beautify("An example of text", text ->  {
            String str = new String(text);
            text = str.toLowerCase();
            return text;
        });
        poemBeautifier.beautify("An example of text", text ->  {
            String str = new String(text);
            char[] textArray = str.toCharArray();
            String spaces = "";
            for (int i=0; i<textArray.length; i++) {
                System.out.println(spaces + textArray[i]);
                spaces += "   ";
            };
            return "voila!";
        });

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        //7.3 module- task
        Forum forum = new Forum();
        System.out.println("Collection of forum users before processing has " + forum.getForumUserList().size() + " users.");
        Map<Integer, ForumUser> theForumUsersMap = forum.getForumUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.calculateUserAge() >= 20)
                .filter(user -> user.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Collection of forum users after processing has " + theForumUsersMap.size() + " users.");
        theForumUsersMap.entrySet().stream()
                .map(entry -> "User #" + entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
        System.out.println("");
        System.out.println("End of processing");
        System.out.println("---------------------------------------------");
        System.out.println("");
    }
}
