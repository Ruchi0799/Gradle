package com.bridgelabz;
import org.junit.runner.RunWith;

public class UserRegistration extends Exception{
    public boolean validFirstName(String firstName) throws UserRegistrationException {
        String regexFN="[A-Z][a-z]{2,}";
        if(firstName.length()<=0)
        {
            throw new UserRegistrationException("FirstName cannot be empty");
        }
        if (firstName.length()<=3)
        {
            throw new UserRegistrationException("Firstname should be of atleast three letters");
        }
        if(Character.isUpperCase(firstName.indexOf(0)))
        {
            throw new UserRegistrationException("First letter should be capital");
        }
        try {
            if (firstName.matches(regexFN))
                return true;
            else
                return false;
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException("FirstName cannot be null");
        }


    }



    public boolean validLastName(String lastName) throws UserRegistrationException {
        String regexFN="[A-Z][a-z]{2,}";
        if(lastName.length()<=0)
        {
            throw new UserRegistrationException("LastName cannot be empty");
        }
        if (lastName.length()<=3)
        {
            throw new UserRegistrationException("Lastname should be of atleast three letters");
        }
        if(Character.isUpperCase(lastName.indexOf(0)))
        {
            throw new UserRegistrationException("First letter should be capital");
        }
        try {
            if (lastName.matches(regexFN))
                return true;
            else
                return false;

        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException("LastName cannot be null");
        }


    }

    public boolean validEmail(String Email) throws UserRegistrationException {
        String regexFN="^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
        if((!(Email.contains("@")))&&Email.length()>=1)
        {
            throw new UserRegistrationException("@ is missing");
        }
        try {
            if (Email.matches(regexFN))
                return true;
            else
                return false;
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException("Email cannot be null");
        }



    }

    public boolean validMobileNo(String MobileNo) throws UserRegistrationException {
        String regexFN="^[0-9-]{1,}\\s[0-9]{10}$";
        if (MobileNo.length()<=12&&MobileNo.length()>=1)
        {
            throw new UserRegistrationException("Mobile no must be if size 10");
        }
        try {
            if (MobileNo.matches(regexFN))
                return true;
            else
                return false;
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException("Mobile no Cannot be empty");
        }

    }

    public boolean validPassword(String Password) throws UserRegistrationException {
        String regexFN="^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
        if (Password.length()<=7&&Password.length()>=1)
        {
            throw new UserRegistrationException("Password must be of size 8");
        }
        try {
            if (Password.matches(regexFN))
                return true;
            else
                return false;
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException("Password cannot be null");
        }



    }
}

