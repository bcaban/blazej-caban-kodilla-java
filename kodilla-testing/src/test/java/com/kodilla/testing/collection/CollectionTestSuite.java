package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin.");
    }
    @After
    public void after() {
        System.out.println("Test Case: end.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(evenList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(4);
        evenList.add(6);
        evenList.add(22);
        evenList.add(18);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(15);
        numbers.add(22);
        numbers.add(18);
        numbers.add(3);
        numbers.add(17);
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(evenList, result);
    }


}
