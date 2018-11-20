package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {

        theForumUserList.add(new ForumUser(1111, "Adam", 'M', LocalDate.of(1966, 11, 5), 52));
        theForumUserList.add(new ForumUser(2222, "Kasia", 'F', LocalDate.of(1996, 1, 3), 60));
        theForumUserList.add(new ForumUser(3333, "Kuba", 'M', LocalDate.of(1985, 6, 23), 10));
        theForumUserList.add(new ForumUser(4444, "Tomek", 'M', LocalDate.of(1990, 8, 11), 0));
        theForumUserList.add(new ForumUser(5555, "Asia", 'F', LocalDate.of(1970, 5, 8), 14));
        theForumUserList.add(new ForumUser(6666, "Kamil", 'M', LocalDate.of(1962, 5, 10), 25));
        theForumUserList.add(new ForumUser(7777, "Sylwia", 'F', LocalDate.of(1983, 2, 12), 60));
        theForumUserList.add(new ForumUser(8888, "Dominika", 'F', LocalDate.of(1992, 12, 16), 15));
        theForumUserList.add(new ForumUser(9999, "Karol", 'M', LocalDate.of(2000, 8, 20), 85));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
