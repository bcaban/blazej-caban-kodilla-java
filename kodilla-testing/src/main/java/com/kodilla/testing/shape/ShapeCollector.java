package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();


    public void addFigure(Shape shape) {
        figures.add(shape);


    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);


    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n<figures.size()) {
            shape = figures.get(n);
        }
        return shape;
    }


    public int getFigureQuantity() {
        return figures.size();
    }

    public ArrayList<Shape> showFigures() {
        for (Shape theFigure: figures) {
            System.out.println("The area of the: " + theFigure.getShapeName() + " equals: " + theFigure.getField() );
        }
        return figures;

    }

}
