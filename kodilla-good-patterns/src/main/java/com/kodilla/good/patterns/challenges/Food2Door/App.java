package com.kodilla.good.patterns.challenges.Food2Door;

public class App {
    public static void main(String[] args) {

        OrderInput orderInput = new OrderInput();
        Producer producer = orderInput.input("Bananas", 20);
        OrderProcess orderFoodProcess = new OrderProcess(new OrderRespository());
        orderFoodProcess.run(producer);
    }
}