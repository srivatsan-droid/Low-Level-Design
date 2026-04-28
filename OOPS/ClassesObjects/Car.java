package OOPS.ClassesObjects;

public class Car {
    private String brand;
    private String model;
    private int speed;

    // Constructor With Parameters
    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // Method to Accerlerate
    public void accelerate(int increment) {
        speed += increment;
    }

    public void displayInfo() {
        System.out.println(brand + " is running at " + speed + " Km/hr ");
    }

    public static void main(String[] args) {
        Car obj = new Car("Toyota", "Etios", 200);
        obj.accelerate(1000);
        obj.displayInfo();
    }
}
