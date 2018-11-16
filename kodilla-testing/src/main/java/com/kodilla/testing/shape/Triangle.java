package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String shapeName;
    Double field;

    public Triangle(String shapeName, Double field) {
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(shapeName, triangle.shapeName) &&
                Objects.equals(field, triangle.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
