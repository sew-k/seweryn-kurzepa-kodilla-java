package com.kodilla.testing.shape;

public class Circle  implements Shape {
    private String name = "circle";
    private int field;

    public String getShapeName() {
        return name;
    }

    public int getField() {
        return this.field;
    }

    public Circle(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        Shape shape = new Circle(field);
        String result = "[" + shape.getShapeName() + ":" + shape.getField() + "]";
        return result;
    }
}
