package com.kodilla.patterns.builder.checkers;

public class Figure {
    public static final String BLACK = "BLACK";
    public static final String WHITE = "WHITE";
    final private String color;

    public Figure(String color) {
        if (color.equals(BLACK) || color.equals(WHITE)) {
            this.color = color;
        } else {
            throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
        }
    }

    public String getColor() {
        return color;
    }
}
