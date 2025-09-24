class Car1 {
    protected String make;
    protected String model;
    public void startEngine() {
        System.out.println("Engine started");
    }
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}
class ElectricCar extends Car1 {
    public void chargeBattery() {
        System.out.println("Battery Charging");
    }
    public void startEngine() {
        System.out.println("Electric car is saving Fuel");
    }
}
class GlassCar extends Car1 {
    public void fillTank() {
        System.out.println("Filling the Gas Tank");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Car1 obj = new Car1();
        obj.startEngine();
        obj.stopEngine();
        ElectricCar obj2 = new ElectricCar();
        obj2.chargeBattery();
        obj2.startEngine();
        GlassCar obj3 = new GlassCar();
        obj3.fillTank();
    }
}
