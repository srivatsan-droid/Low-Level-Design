package OOPS.Interfaces.Exercise;

import java.util.List;

interface Validator {
    boolean validate(String input);
}

class EmailValidator implements Validator {
    public boolean validate(String input) {
        return input.contains("@");
    }
}

class PasswordValidator implements Validator {
    public boolean validate(String input) {
        if (input.length() >= 8) {
            return true;
        }
        return false;
    }
}

class RegistrationService {
    public List<Validator> validators;

    public RegistrationService(List<Validator> validators) {
        this.validators = validators;
    }

    public void register(String input) {
        for (Validator v : validators) {
            if (!v.validate(input)) {
                System.out.println("\"" + input + "\" - FAILED");
                return; // 🔴 stop here
            }
        }
        System.out.println("\"" + input + "\" - PASSED");
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Validator> emailValidators = List.of(new EmailValidator());
        RegistrationService emailReg = new RegistrationService(emailValidators);
        emailReg.register("user@example.com"); // Should pass
        emailReg.register("invalid-email"); // Should fail

        List<Validator> passwordValidators = List.of(new PasswordValidator());
        RegistrationService passReg = new RegistrationService(passwordValidators);
        passReg.register("strongpassword"); // Should pass
        passReg.register("short");
    }
}
