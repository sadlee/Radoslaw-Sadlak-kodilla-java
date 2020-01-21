package com.kodilla.patterns222.decorator.pizza;

import java.math.BigDecimal;

public class Cheese extends AbstractPizzaOrderDecorator {

    public Cheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Cheese";
    }
}