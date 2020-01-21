package com.kodilla.patterns222.decorator.pizza;

import java.math.BigDecimal;

public class Ham extends AbstractPizzaOrderDecorator {

    public Ham(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Ham";
    }
}