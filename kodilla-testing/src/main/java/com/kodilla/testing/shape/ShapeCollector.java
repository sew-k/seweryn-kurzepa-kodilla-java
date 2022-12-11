package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape) {
        if (shape.getField() > 0) {
            collection.add(shape);
        }
    }

    public boolean removeFigure(Shape shape) {
        if (collection.contains(shape)) {
            collection.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        if ((!collection.isEmpty()) && (collection.size() >= n)) {
            return collection.get(n);
        }
        else return null;
    }

    public String showFigures() {
        if (!collection.isEmpty()) {
            String result = "";
            for (Shape shape : collection) {
                result += shape.toString();
            }
            System.out.println(result);
            return result;
        } else {
            return null;
        }
    }

    public int getCollectionSize() {
        return collection.size();
    }

}
