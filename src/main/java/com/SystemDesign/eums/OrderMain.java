package com.SystemDesign.eums;

public class OrderMain {
    public static void main(String[] args) {
       OrderStatus obj = OrderStatus.SHIPPED;
       if(obj == OrderStatus.SHIPPED) {
           System.out.println("Order is Shipped");
       }
    }
}
