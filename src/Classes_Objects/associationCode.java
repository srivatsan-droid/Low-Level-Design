package Classes_Objects;
class Car {
    String model;
    Car(String model) {
        this.model = model;
    }
    void drive() {
        System.out.println("Driving a " + model);
    }
}
class Person {
    String name;
    Car car;
    Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }
    void goForDrive() {
        System.out.println(name + " is going for a Drive");
        car.drive();
    }
}
public class associationCode {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model");
        Person person = new Person("Alice" , car);
        person.goForDrive();
    }
}
