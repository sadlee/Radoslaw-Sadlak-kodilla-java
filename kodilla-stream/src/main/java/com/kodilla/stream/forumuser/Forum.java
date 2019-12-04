package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();
    public Forum() {
        theForumUser.add(new ForumUser(1,"Adam",'M',1992,1,11,12));
        theForumUser.add(new ForumUser(2,"Lars",'M',1997,5,25,0));
        theForumUser.add(new ForumUser(3,"Marek",'M',1995,2,3,19));
        theForumUser.add(new ForumUser(4,"Kasia",'F',1999,12,1,22));
        theForumUser.add(new ForumUser(5,"Olka",'F',1991,7,31,0));
        theForumUser.add(new ForumUser(6,"Inga",'F',1988,11,8,35));
        theForumUser.add(new ForumUser(7,"Stefan",'M',2000,8,11,5));
        theForumUser.add(new ForumUser(8,"Aga",'F',1982,10,15,47));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
