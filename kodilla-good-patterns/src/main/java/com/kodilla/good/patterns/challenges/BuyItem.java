package com.kodilla.good.patterns.challenges;

public class BuyItem {
    public User user;
    public boolean isBuyed;

    public BuyItem(User user, boolean isBuyed) {
        this.user = user;
        this.isBuyed = isBuyed;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsBuyed() {
        return isBuyed;
    }
}