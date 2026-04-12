package OOPS.ClassesObjects;

class car {
    private String brand;
    private String model;
    private int speed;

    // constructor
    public car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accerlate(int increment) {
        speed += increment;
    }

    public void displayInfo() {
        System.out.println(brand + " is running at " + speed + " km/hr");
    }
}

public class classObjectExample {
    public static void main(String[] args) {
        car obj = new car("Honda", "Civic", 100);
        obj.accerlate(40);
        obj.displayInfo();
    }
}
