package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "square";
    private int field;

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return this.field;
    }

    public Square(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        Shape shape = new Square(field);
        String result = "[" + shape.getShapeName() + ":" + shape.getField() + "]";
        return result;
    }
}
