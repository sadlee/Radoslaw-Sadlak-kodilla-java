package com.kodilla.patterns222.facade;
import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}