package com.SystemDesign.SolidPrinciples.SingleResponsibilityPrinciple.Sample;

public class UserRepository {
    public void save(User user) {
        System.out.println("Saving user " + user.getUsername() + " to database");
    }
}
