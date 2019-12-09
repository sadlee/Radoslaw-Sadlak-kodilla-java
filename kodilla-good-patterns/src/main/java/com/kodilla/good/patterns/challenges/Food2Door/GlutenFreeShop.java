package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producer {
    private String product;
    private double quantity;

    public GlutenFreeShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean process() {
        System.out.println("Order processing: " + product + ", " + quantity);
        return true;
    }
}