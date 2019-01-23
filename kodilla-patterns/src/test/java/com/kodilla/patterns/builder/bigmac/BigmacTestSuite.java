package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BicmacBuilder()
                .bun("with sesame seeds")
                .burgers(2)
                .sauce("barbecue")
                .ingredients("salad")
                .ingredients("onion")
                .ingredients("bacon")
                .ingredients("cucumber")
                .ingredients("chilli peppers")
                .ingredients("mushrooms")
                .ingredients("cheese")
                .ingredients("egg")
                .build();
        System.out.println(bigmac);
        //When
        int numbersOfIngredients = bigmac.getIngredients().size();
        //Than
        Assert.assertEquals(7, numbersOfIngredients);
    }
}
