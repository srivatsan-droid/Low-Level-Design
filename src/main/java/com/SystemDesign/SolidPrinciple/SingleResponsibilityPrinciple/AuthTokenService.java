package com.SystemDesign.SolidPrinciple.SingleResponsibilityPrinciple;

public class AuthTokenService {
    public String generateToken(User user) {
        String payload = "{\"username\" :\"" +  user.getUserName() + "\",\"email\":\"" + user.getEmail();
        return "eyjkfnndfnmgdfg" + payload + " . signature";
    }
}
