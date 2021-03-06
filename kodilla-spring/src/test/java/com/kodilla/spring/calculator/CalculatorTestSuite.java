package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(2.0, 0.5);
        double result2 = calculator.sub(4.0, 0.5);
        double result3 = calculator.mul(6.2, 8.8);
        double result4 = calculator.div(8.5, 3.4);
        //Then
        Assert.assertEquals(2.5, result1, 0.01);
        Assert.assertEquals(3.5, result2, 0.01);
        Assert.assertEquals(54.56, result3, 0.01);
        Assert.assertEquals(2.5, result4, 0.01);




    }
}
