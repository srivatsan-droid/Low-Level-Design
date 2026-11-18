package DesignPattern.FactoryMethod;

public class HTMLButton implements Button{
    public void render() {
        System.out.println("<button> Test Button</button>");
    }
    public void onClick() {
        System.out.println("Click ! button says - Hello World");
    }
}
