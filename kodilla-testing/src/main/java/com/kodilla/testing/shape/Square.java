package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String shapeName;
    Double field;

    public Square(String shapeName, Double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Double getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(shapeName, square.shapeName) &&
                Objects.equals(field, square.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
