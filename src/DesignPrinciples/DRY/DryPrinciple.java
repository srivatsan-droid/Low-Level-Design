package DesignPrinciples.DRY;

public class DryPrinciple {
    public static void main(String[] args) {
        EmailValidator obj = new EmailValidator();
        User user = new User("Srira5srivatsan@gmail.com");
        obj.registerUser(user);
        obj.sendNewsletter(user);
    }
}
