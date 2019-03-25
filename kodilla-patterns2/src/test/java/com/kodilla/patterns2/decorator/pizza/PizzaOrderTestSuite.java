package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testPizza1() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        theOrder = new BeefDecorator(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println(description.substring(0, 70));
        System.out.println("Total cost: " + theCost);
        //Then
        assertEquals(new BigDecimal(38), theCost);
        assertEquals("Order new pizza with: extra cheese, pineapple, beef, tomatoes, shrimps,", description);
    }

    @Test
    public void testPizza2() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TomatoesDecorator(theOrder);
        theOrder = new LambDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println(description.substring(0, 51));
        System.out.println("Total cost: " + theCost);
        //Then
        assertEquals(new BigDecimal(33), theCost);
        assertEquals("Order new pizza with: tomatoes, lamb, olives, onion,", description);
    }
}