package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRespository {
    public boolean createOrder(String nameFirm, String product, double quantity) {
        System.out.println("Order created: " + "producer:" + " " + nameFirm + ", order: " + product + ", quantity: " + quantity);
        return true;
    }
}