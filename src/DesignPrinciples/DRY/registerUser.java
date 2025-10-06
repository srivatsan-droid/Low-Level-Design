package DesignPrinciples.DRY;

public class registerUser {
    public void registerUser(User user) {
        if(user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid Email");
        }
    }
    public void sendNewsletter(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return;
        }
        // Additional logic
    }
}
