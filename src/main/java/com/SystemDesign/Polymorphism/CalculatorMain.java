package com.SystemDesign.Polymorphism;

class Calculator {
    int add(int a,int b) {
        return a + b;
    }
    double add(double a,double b) {
        return a +b;
    }
    int add(int a,int b,int c) {
        return a + b + c;
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1.2,2.4));
        System.out.println(obj.add(1,2,4));
    }
}
