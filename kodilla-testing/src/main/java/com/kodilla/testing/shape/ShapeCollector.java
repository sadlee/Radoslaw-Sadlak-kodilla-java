package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollection = new ArrayList<Shape>();
    public Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeCollection.get(n);
    }

    int size() {
        return shapeCollection.size();
    }
}