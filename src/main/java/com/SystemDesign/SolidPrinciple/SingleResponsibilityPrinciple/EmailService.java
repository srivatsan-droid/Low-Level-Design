package com.SystemDesign.SolidPrinciple.SingleResponsibilityPrinciple;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending an Welcome Email : " + user.getEmail());
        System.out.println("Welcome to Our Platform : " + user.getUserName() + " ! ");
    }
}
