package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(255, "Janusz54", 'M', LocalDate.of(1968, 12,12), 0));
        forumUserList.add(new ForumUser(256, "Halinka", 'K', LocalDate.of(1968, 12,11), 5));
        forumUserList.add(new ForumUser(290, "Piotr007", 'M', LocalDate.of(1968, 12,21), 155));
        forumUserList.add(new ForumUser(293, "JanekKos", 'M', LocalDate.of(2011, 1,30), 10));
        forumUserList.add(new ForumUser(294, "Ja366", 'M', LocalDate.of(1968, 12,5), 0));
        forumUserList.add(new ForumUser(295, "Ania2", 'K', LocalDate.of(2010, 2,15), 10));
        forumUserList.add(new ForumUser(296, "Katarzyna", 'K', LocalDate.of(2007, 5,12), 10));
        forumUserList.add(new ForumUser(350, "Jan", 'M', LocalDate.of(1968, 8,12), 3));
        forumUserList.add(new ForumUser(355, "Bartek", 'M', LocalDate.of(2005, 11,18), 0));
        forumUserList.add(new ForumUser(356, "JanuszX", 'M', LocalDate.of(2015, 1,16), 11));
        forumUserList.add(new ForumUser(357, "Basia", 'K', LocalDate.of(2010, 11,12), 255));
        forumUserList.add(new ForumUser(358, "Andrew", 'M', LocalDate.of(1999, 10,6), 10));
        forumUserList.add(new ForumUser(359, "Ewelina", 'K', LocalDate.of(1988, 9,19), 1000));
        forumUserList.add(new ForumUser(365, "Eee", 'K', LocalDate.of(1989, 2,12), 10));
        forumUserList.add(new ForumUser(366, "Janusz54", 'K', LocalDate.of(1934, 3,17), 11));
        forumUserList.add(new ForumUser(395, "Tomasz", 'M', LocalDate.of(1955, 5,10), 0));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
