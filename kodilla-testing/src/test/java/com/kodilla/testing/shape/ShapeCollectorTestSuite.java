package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0, shapeCollector.getFigureQuantity());


    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedSquare = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square, retrievedSquare);

    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        shapeCollector.addFigure(square);

        //When
        ArrayList<Shape> result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(result.get(0), square);

    }

    @Test
    public void testGetFigureUnder() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        shapeCollector.addFigure(square);

        //When
        Shape result = shapeCollector.getFigure(-5);

        //Then
        Assert.assertEquals(null, result);

    }

    @Test
    public void testGetFigureOver() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 45.0);
        shapeCollector.addFigure(square);
        //When
        Shape result = shapeCollector.getFigure(5454);
        //Then
        Assert.assertEquals(null, result);
    }
}


