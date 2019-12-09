package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {
    private String product;
    private double quantity;
    private boolean isOrder;

    public OrderDto(final String product, double quantity, final boolean isOrder) {
        this.product = product;
        this.quantity = quantity;
        this.isOrder = isOrder;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isOrder() {
        return isOrder;
    }
}