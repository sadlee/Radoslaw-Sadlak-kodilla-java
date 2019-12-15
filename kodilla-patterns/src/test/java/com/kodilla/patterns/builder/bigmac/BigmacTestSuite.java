package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigMac = new Bigmac.BigmacBuilder()
                .roll("with sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("cucumber")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}