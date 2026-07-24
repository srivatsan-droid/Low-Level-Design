package com.SystemDesign.SolidPrinciple.LiskovSubstitutionPrinciple.Exercise;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.println("Rectangle area: " + (int) rectangle.getArea());
        System.out.println("Square area: " + (int) square.getArea());
    }
}