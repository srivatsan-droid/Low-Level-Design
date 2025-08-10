package Classes_Objects;
class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks : Woof Woof");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
