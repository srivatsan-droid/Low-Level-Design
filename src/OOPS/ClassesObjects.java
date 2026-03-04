package OOPS;

public class ClassesObjects {
    private String brand;
    private String model;
    private int speed;
    //Constructor
    public ClassesObjects(String brand,String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    public void accelerate(int increment) {
        speed += increment;
    }
    //Method to Display Info
    public void displayDetails() {
        System.out.println(brand + " is running at " + speed + " kn/hr");
    }
    public static void main(String[] args) {
        ClassesObjects obj = new ClassesObjects("Hyundai","Contessa");
        obj.accelerate(1200);
        obj.displayDetails();
        ClassesObjects obj1 = new ClassesObjects("Ford","Mustang");
        obj1.accelerate(400);
        obj1.displayDetails();
    }

}
