package DesignPrinciples.DRY;

public class EmailValidator {
    public static boolean isValid(String email) {
        return email != null && email.contains("@") && email.contains(".") && (email.endsWith(".com") || email.endsWith(".org"));
    }
    public void registerUser(User user) {
        if (!EmailValidator.isValid(user.getEmail())) {
            throw new IllegalArgumentException("Invalid email");
        }
        // Additional logic
        else {
            System.out.println("Email is Valid");
        }
    }

    public void sendNewsletter(User user) {
        if (!EmailValidator.isValid(user.getEmail())) {
            return;
        }
        // Additional logic
        else {
            System.out.println("Email is Valid");
        }
    }
}
