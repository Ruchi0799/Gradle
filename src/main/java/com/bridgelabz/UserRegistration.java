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
}
