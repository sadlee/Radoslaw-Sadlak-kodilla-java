package com.kodilla.patterns222.decorator.pizza;

import java.math.BigDecimal;

public class Sauce extends AbstractPizzaOrderDecorator {

    public Sauce(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sauce";
    }
}