package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.5, 0.8);
        } catch(Exception e) {
            System.out.println("Suspect value " + e);
        } finally {
            System.out.println("Always here");
        }
    }
}