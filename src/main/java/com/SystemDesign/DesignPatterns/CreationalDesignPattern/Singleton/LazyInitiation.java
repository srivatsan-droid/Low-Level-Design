package com.SystemDesign.DesignPatterns.CreationalDesignPattern.Singleton;

public class LazyInitiation {
    private static LazyInitiation instance;

    //Private Constructor prevents creating objects from outside the class
    private LazyInitiation() {}

    public static LazyInitiation getInstance() {
        if(instance == null) {
            instance = new LazyInitiation();
        }
        return instance;
    }
}
