package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName = "triangle";
    private double field = 0;

    public Triangle(double field) {
        this.field = field;
    }

    public Triangle() {
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
