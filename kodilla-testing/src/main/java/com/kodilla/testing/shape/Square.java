package com.kodilla.testing.shape;

public class Square implements Shape{
    private String shapeName = "square";
    private double field = 0;

    public Square(double field) {
        this.field = field;
    }

    public Square() {
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
