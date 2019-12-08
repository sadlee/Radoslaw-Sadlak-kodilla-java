package com.kodilla.good.patterns.challenges;

public class StoreApp {
    public static void main(String[] args) {
        BuyNowRetriever buyNowRetriever = new BuyNowRetriever();
        BuyNow buyNow = buyNowRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new Information(), new ProductOrderService(),
                new OrderRepository());
        orderProcessor.process(buyNow);
    }
}