package com.kodilla.good.patterns.challenges;

public class BuyNowRetriever {
    public BuyNow retrieve() {
        User user = new User("John", "snow");
        String thing = "Laptop";
        int price = 1500;

        return new BuyNow(user, thing, price);
    }
}