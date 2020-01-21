package com.kodilla.patterns222.decorator.pizza;

import java.math.BigDecimal;

public class Tomatoes extends AbstractPizzaOrderDecorator {

    public Tomatoes(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Tomatoes";
    }
}