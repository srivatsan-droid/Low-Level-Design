package com.SystemDesign.Inheritance;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        // TODO: return 0 by default
        return 0;
    }

    public double perimeter() {
        // TODO: return 0 by default
        return 0;
    }

    public void describe() {
        // TODO: print "Shape: name, Area: area, Perimeter: perimeter"
        // Hint: use String.format("%.2f", value) for formatting
        System.out.println(
                "Shape: " + name +
                        ", Area: " + String.format("%.2f", area()) +
                        ", Perimeter: " + String.format("%.2f", perimeter())
        );
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        // TODO: initialize this.radius
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO: return Math.PI * radius * radius
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // TODO: return 2 * Math.PI * radius
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        // TODO: initialize this.width and this.height
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // TODO: return width * height
        return width * height;
    }

    @Override
    public double perimeter() {
        // TODO: return 2 * (width + height)
        return 2 * (width + height);
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.describe();

        Rectangle rect = new Rectangle(4.0, 6.0);
        rect.describe();
    }
}
