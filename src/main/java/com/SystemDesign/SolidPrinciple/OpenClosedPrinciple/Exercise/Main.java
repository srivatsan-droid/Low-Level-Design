package com.SystemDesign.SolidPrinciple.OpenClosedPrinciple.Exercise;

interface ShippingStrategy  {
    double calculateCost(double weight);
}
class StandardShipping implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return weight * 1.5;
    }
}
class ExpressShipping implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return weight * 3.0;
    }
}
class OvernightShipping implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return weight * 5.0;
    }
}
class InternationalShipping implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return weight * 10.0;
    }
}
class ShippingCostCalculator {
    private final ShippingStrategy shippingStrategy;

    public ShippingCostCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
    public double calculate(double weight) {
        return shippingStrategy.calculateCost(weight);
    }
}
// Usage
public class Main {
    public static void main(String[] args) {
        ShippingCostCalculator standardCalculator =
                new ShippingCostCalculator(new StandardShipping());

        ShippingCostCalculator expressCalculator =
                new ShippingCostCalculator(new ExpressShipping());

        ShippingCostCalculator overnightCalculator =
                new ShippingCostCalculator(new OvernightShipping());

        ShippingCostCalculator internationalCalculator =
                new ShippingCostCalculator(new InternationalShipping());

        double weight = 2.0;

        System.out.println("Standard: $" + standardCalculator.calculate(weight));
        System.out.println("Express: $" + expressCalculator.calculate(weight));
        System.out.println("Overnight: $" + overnightCalculator.calculate(weight));
        System.out.println("International: $" + internationalCalculator.calculate(weight));
    }
}


