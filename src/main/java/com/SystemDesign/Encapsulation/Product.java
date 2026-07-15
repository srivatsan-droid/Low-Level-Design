package com.SystemDesign.Encapsulation;

public class Product {
    private String name;
    private double price;

    public Product(String name,double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("The Price of the Product is : " + price + "\nThe Name of the Product is : " + name);
    }
    public static void main(String[] args) {
        Product obj = new Product("Headphones",12.2);
        obj.display();
    }
}
