package com.SystemDesign.Inheritance;
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void startEngine() {
        System.out.println("Engine Started");
    }
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}
class ElectricCar extends Vehicle {
    private int batteryCapacity;
    public ElectricCar(String make,String model,int year,int batteryCapacity) {
        super(make,model,year);
        this.batteryCapacity = batteryCapacity;
    }
    public void chargeBattery() {
        System.out.println("charging : " + batteryCapacity + " kw/h");
    }
}
class GasCar extends Vehicle {
    private double fuelTankSize;

    public GasCar(String make, String model, int year, double fuelTankSize) {
        super(make, model, year);
        this.fuelTankSize = fuelTankSize;
    }

    public void fillTank() {
        System.out.println("Filling " + fuelTankSize + "L fuel tank");
    }
}
public class CarExample {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("Honda","Civic",2010);
        ElectricCar car = new ElectricCar(veh.make,veh.model,veh.year, (int) 22220.70);
        car.displayInfo();
        car.startEngine();
    }
}
