package com.kodilla.good.patterns.challenges.Food2Door;

public interface Producer {
    String getProduct();

    double getQuantity();

    public boolean process();
}