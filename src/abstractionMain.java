abstract class Vehicle {
    String brand;
    //constructor
    Vehicle(String brand) {
        this.brand = brand;
    }
    //Abstract method (must be implemented by subclasses)
    void displayBrand() {
        System.out.println("Brand " +brand);
    }

    abstract void start();
}
public class abstractionMain extends Vehicle{

    abstractionMain(String brand) {
        super(brand);
    }
    @Override
    void start() {
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        abstractionMain obj = new abstractionMain("Toyata");
        obj.start();
    }
}
