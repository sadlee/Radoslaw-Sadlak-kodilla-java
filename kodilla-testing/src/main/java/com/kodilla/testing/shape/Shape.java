package com.kodilla.testing.shape;

public interface Shape {

    String getShapeName();

    int getArea();
}

class Square implements Shape {
    public Square() {
    }

    public String getShapeName() {
        return "Square";
    }

    public int getArea() {
        return 452;
    }
}

class Triangle implements Shape {
    public Triangle() {
    }

    public String getShapeName() {
        return "Triangle";
    }

    public int getArea() {
        return 384;
    }
}