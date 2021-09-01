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
        String regexFN="^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{3})$";
        if (Email.matches(regexFN))
            return true;
        else
            return false;

    }

    public boolean validMobileNo(String MobileNo) {
        String regexFN="^[0-9-]{1,}\\s[0-9]{10}$";
        if (MobileNo.matches(regexFN))
            return true;
        else
            return false;

    }

    public boolean validPassword(String Password) {
        String regexFN="^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
        if (Password.matches(regexFN))
            return true;
        else
            return false;

    }
}

