package com.SystemDesign.SolidPrinciple.LiskovSubstitutionPrinciple.Exercise;

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
    }
}