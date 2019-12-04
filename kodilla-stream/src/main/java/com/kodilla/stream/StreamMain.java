package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getDayOfYear() < 1998)
                .filter(forumUser -> forumUser.getBirthDate().getYear() > LocalDate.now().getYear()-20)
                .filter(forumUser -> forumUser.getQuantityPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));
        System.out.println("# elements: " + theResultMapOfForumUser.size());
            theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}