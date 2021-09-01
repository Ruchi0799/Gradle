package com.bridgelabz;
import org.junit.runner.RunWith;

public class UserRegistration {
    public boolean validFirstName(String firstName) {
        String regexFN="[A-Z][a-z]{2,}";
        if (firstName.matches(regexFN))
            return true;
        else
            return false;

    }

    public boolean validLastName(String lastName) {
        String regexFN="[A-Z][a-z]{2,}";
        if (lastName.matches(regexFN))
            return true;
        else
            return false;

    }

    public boolean validEmail(String Email) {
        String regexFN="^[A-Z]?[a-z]{3,}[.-_+]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2})?$";
        if (Email.matches(regexFN))
            return true;
        else
            return false;

    }
}
