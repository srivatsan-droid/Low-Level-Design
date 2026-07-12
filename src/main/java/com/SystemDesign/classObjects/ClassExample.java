package com.SystemDesign.classObjects;

class Car {
    private String brand;
    private String model;
    private int speed;
    //Constructor With Parameters
    public Car(String brand,String model,int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    //Method to Accerlate
    public void accelerate(int increment) {
        speed+=increment;
    }
    //Method to Display Info
    public void displayInfo() {
        System.out.println(brand + " is running at " + speed + " km/hr");
    }
}
public class ClassExample {
    public static void main(String[] args) {
        Car obj = new Car("Honda","Civic",120);
        obj.accelerate(10);
        obj.displayInfo();
    }
}
