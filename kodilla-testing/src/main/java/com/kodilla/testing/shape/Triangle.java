package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "triangle";
    private int field;

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return this.field;
    }

    public Triangle(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        Shape shape = new Triangle(field);
        String result = "[" + shape.getShapeName() + ":" + shape.getField() + "]";
        return result;
    }
}
