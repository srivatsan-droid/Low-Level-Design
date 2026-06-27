package com.SystemDesign.classesObjects;

public class CarExample {
    //Attributes
    private String brand;
    private String model;
    private int speed;

    //Constructor
    public CarExample(String brand,String model,int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    public void accelerate(int increment) {
        speed += increment;
    }
    public void displayStatus() {
        System.out.println(brand + " is running at " + speed + " km/hr");
    }
    public static void main(String[] args) {
        CarExample obj = new CarExample("Honda","Civic",120);
        obj.accelerate(1200);
        obj.displayStatus();
    }
}
