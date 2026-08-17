package com.SystemDesign.SolidPrinciples.SingleResponsibilityPrinciple.Sample;

public class AuthService {
    public String generateToken(User user) {
        String payload = "{\"username\":\"" + user.getUsername() + "\",\"email\":\"" + user.getEmail() + "\"}";
        // Sign with secret key (simplified)
        return "eyJhbGciOiJIUzI1NiJ9." + payload + ".signature";
    }
}
