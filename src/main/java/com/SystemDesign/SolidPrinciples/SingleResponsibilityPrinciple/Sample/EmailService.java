package com.SystemDesign.SolidPrinciples.SingleResponsibilityPrinciple.Sample;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending Welcome email to: " + user.getEmail());
        System.out.println("Welcome to our platform, " + user.getUsername());
    }
}
