package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String shapeName = "circle";
    private double field = 0;

    public Circle(double field) {
        this.field = field;
    }

    public Circle() {
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return this.shapeName;
    }
}
