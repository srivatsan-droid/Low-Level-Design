class Car {
    private String brand;
    private String model;
    private int speed;
    //Constructor
    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    //Method to Accelerate
    public void accelerate(int increment) {
        speed+=increment;
    }
    public void displayInfo() {
        System.out.println(brand + " Speed after Increment is : " + speed);

    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        Car object = new Car("Toyota" , "Corolla",0);
        object.accelerate(20);
        object.displayInfo();
    }
}
