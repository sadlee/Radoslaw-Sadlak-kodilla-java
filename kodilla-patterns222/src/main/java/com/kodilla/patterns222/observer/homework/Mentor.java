package com.kodilla.patterns222.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println(mentorName + ": New task from - " + studentTask.getName() + "\n" +
                " total tasks: " + studentTask.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}