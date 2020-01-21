package com.kodilla.patterns222.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza", description);
    }

    @Test
    public void testDifferentPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Cheese(theOrder);
        theOrder = new Ham(theOrder);
        theOrder = new Sauce(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testDifferentPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Cheese(theOrder);
        theOrder = new Ham(theOrder);
        theOrder = new Sauce(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + Cheese + Ham + Sauce", description);
    }
}