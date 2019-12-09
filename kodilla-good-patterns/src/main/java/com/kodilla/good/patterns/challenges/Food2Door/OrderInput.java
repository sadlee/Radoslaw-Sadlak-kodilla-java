package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderInput {
    public Producer input(String product, double quantity) {

        if(quantity<10){
            return new ExtraFoodShop(product, quantity);
        } else if(quantity>=10 && quantity<15){
            return new HealthyShop(product, quantity);
        } else {
            return new GlutenFreeShop(product, quantity);
        }
    }
}