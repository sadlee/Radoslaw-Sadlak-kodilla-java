package com.kodilla.stream.immutable;

public class ForumUser {
    private final int IDNumber;
    private final String name;
    private final char sex;

    public ForumUser(final int IDNumber, final String name, final char sex) {
        this.IDNumber = IDNumber;
        this.name = name;
        this.sex = sex;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDNumber=" + IDNumber +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}