package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idUser;
    private final String nickUser;
    private final char sex;
    private final LocalDate birthDate;
    private final int quantityPosts;

    public ForumUser(final int idUser, final String nickUser, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int quantityPosts) {
        this.idUser = idUser;
        this.nickUser = nickUser;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityPosts = quantityPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNickUser() {
        return nickUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nickUser='" + nickUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", quantityPosts=" + quantityPosts +
                '}';
    }
}
