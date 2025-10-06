package DesignPrinciples.Kiss;
interface operation {
    double calculate(double a, double b);
}
class Addition implements operation {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
class subtraction implements operation {
    @Override
    public double calculate(double a , double b) {
        return a - b;
    }
}

public class calciSimple {

}
