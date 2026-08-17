package com.SystemDesign.SolidPrinciples.SingleResponsibilityPrinciple.Sample;

public class PasswordHasher {
    public String validateAndCheck(String password) {
        if(password.length() < 8) {
            throw new IllegalArgumentException("Password must be atleast 8 Characters");
        }
        return "bCrypt_hashed" + password;
    }
}
