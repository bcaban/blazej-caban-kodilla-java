package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given

        int[] numbers = new int[20];

        numbers[0] = 15;
        numbers[1] = 57;
        numbers[2] = 18;
        numbers[3] = 19;
        numbers[4] = 89;
        numbers[5] = 26;
        numbers[6] = 56;
        numbers[7] = 89;
        numbers[8] = 23;
        numbers[9] = 45;
        numbers[10] = 78;
        numbers[11] = 12;
        numbers[12] = 45;
        numbers[13] = 85;
        numbers[14] = 13;
        numbers[15] = 48;
        numbers[16] = 59;
        numbers[17] = 19;
        numbers[18] = 73;
        numbers[19] = 15;


        //When

        double average = ArrayOperations.getAverage(numbers);

        //Then

        Assert.assertEquals(44.2, average, 0.01);
    }
}
