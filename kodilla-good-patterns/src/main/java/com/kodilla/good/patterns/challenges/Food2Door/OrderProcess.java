package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcess {
    private OrderRespository orderRespository;

    public OrderProcess(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public OrderDto run(Producer producer){
        boolean isOrder = producer.process();

        if (isOrder) {
            orderRespository.createOrder(producer.getClass().getSimpleName(), producer.getProduct(), producer.getQuantity());
            return new OrderDto(producer.getProduct(), producer.getQuantity(), true);
        } else {
            return new OrderDto(producer.getProduct(), producer.getQuantity(), false);
        }
    }
}