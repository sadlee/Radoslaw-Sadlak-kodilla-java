package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public boolean sell(BuyNow buyNow) {
        System.out.println("Order created and item sold for: " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname()
                +  " item: " +buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}