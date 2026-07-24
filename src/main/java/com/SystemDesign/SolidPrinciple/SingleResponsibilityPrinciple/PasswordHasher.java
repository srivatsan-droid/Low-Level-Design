package com.SystemDesign.SolidPrinciple.SingleResponsibilityPrinciple;

public class PasswordHasher {
    public String validateAndHash(String password) {
        if(password.length() < 8) {
            throw new IllegalArgumentException("Password must be atleast 8 Characters");
        }
        return "bcrypt_hashed" + password;
    }
}
