package OOPS.ClassObjects.Exercise;
class Car {
    private final String brand;
    private final String model;
    private int speed;
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public int accelerate(int amount) {
        speed += amount;
        return speed;
    }

    public int brake(int amount) {
        speed -= amount;
        if(amount < 0) {
            speed = 0;
        }
        return speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String describe() {
        return brand + " " + model + " at " + speed + " km/h";
    }

}
    public class CarMain {
    public static void main(String[] args) {
        Car obj = new Car("Toyota","Corolla");
        int ans = obj.accelerate(20);
        System.out.println(ans);
        int speed = obj.getSpeed();
        System.out.println(speed);
        String describe = obj.describe();
        System.out.println(describe);
    }
}
