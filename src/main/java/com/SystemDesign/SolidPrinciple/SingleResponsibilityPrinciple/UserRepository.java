package com.SystemDesign.SolidPrinciple.SingleResponsibilityPrinciple;

public class UserRepository {
    public void save(User user) {
        System.out.println("Saving User " + user.getUserName() + " to database");
    }
}
