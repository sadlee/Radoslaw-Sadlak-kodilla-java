package com.kodilla.good.patterns.challenges;

public class OrderRepository {
    public boolean createOrder(BuyNow buyNow) {
        System.out.println("Creating order for: " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname()
                + " item: " + buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}