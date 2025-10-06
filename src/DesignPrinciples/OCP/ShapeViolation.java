package DesignPrinciples.OCP;
class Shape {
    String type;
    public Shape(String type) {
        this.type = type;
    }
}
public class ShapeViolation {
    public double calculateArea(Shape shape) {
        if(shape.type.equals("circle")) {
            return Math.PI * 5 * 5;
        }
        else if(shape.type.equals("rectangle")) {
            return 4 * 6;
        }
        return 0;
    }
    public static void main(String[] args) {
        Shape obj = new Shape("circle");
        ShapeViolation calculator = new ShapeViolation();
        System.out.println(calculator.calculateArea(obj));
    }
}
