package com.kodilla.good.patterns.challenges;

public class Information {
    public boolean inform(BuyNow buyNow) {
        System.out.println("Ordered for: " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname()
                + " item: " + buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}