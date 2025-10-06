package DesignPrinciples.OCP;
interface Shape1 {
    double area();
}
class Circle implements Shape1 {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape1 {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
class AreaCalculator {
    public double calculateArea(Shape1 shape) {
        return shape.area();
    }
}

public class properOCP {
    public static void main(String[] args) {
        Shape1 circle = new Circle(5);
        Shape1 rectangle = new Rectangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
    }
}
