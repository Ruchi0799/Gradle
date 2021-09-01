package com.bridgelabz;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.Test;

public class userregistrationtest{

    @Test
    public void isFirstName_Valid_ifValid_return_true() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName=userRegistration.validFirstName("Ruchi");
        Assert.assertEquals(true,firstName);

    }

    @Test
    public void givenFirstname_WhenNotOfThreeLetters_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validFirstName("Ru");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Firstname should be of atleast three letters",e.getMessage());
        }

    }

    @Test
    public void givenFirstname_WhenNotCapital_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validFirstName("ruch");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("First letter should be capital",e.getMessage());
        }
    }

    @Test
    public void givenFirstname_WhenNull_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validFirstName("");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("FirstName cannot be empty",e.getMessage());
        }

    }

//    @Test
//    public void isLastName_Valid_ifValid_return_true() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean lastName=userRegistration.validLastName("Mandve");
//        Assert.assertEquals(true,lastName);
//
//    }


    @Test
    public void isLastName_Valid_ifValid_return_true() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName=userRegistration.validLastName("Mandve");
        Assert.assertEquals(true,lastName);

    }

    @Test
    public void givenLastname_WhenNotOfThreeLetters_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validLastName("Ma");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Lastname should be of atleast three letters",e.getMessage());
        }

    }

    @Test
    public void givenLastname_WhenNotCapital_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validLastName("mand");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("First letter should be capital",e.getMessage());
        }
    }

    @Test
    public void givenLastname_WhenNull_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validLastName("");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("LastName cannot be empty",e.getMessage());
        }

    }




    @Test
    public void isEmailName_Valid_ifValid_return_true() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean Email=userRegistration.validEmail("abc@yahoo.com");
        Assert.assertEquals(true,Email);

    }

    @Test
    public void givenEmail_WhenNotContainattherate_Generate_Exception() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validEmail("ruchimandvegmail.com");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("@ is missing",e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenNull_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validEmail("");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Email cannot be empty",e.getMessage());
        }

    }

    @Test
    public void isMobileNo_Valid_ifValid_return_true() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean MobileNo=userRegistration.validMobileNo("91 9892735509");
        Assert.assertEquals(true,MobileNo);
    }

    @Test
    public void givenNo_WhenNull_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validMobileNo("");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Mobile no Cannot be empty",e.getMessage());
        }

    }

    @Test
    public void givenEmail_WhenNotOfSizeTen_Generate_Exception() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validMobileNo("91 9895");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Mobile no must be if size 10",e.getMessage());
        }
    }

    
    @Test
    public void isPassword_Valid_ifValid_return_true() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean Password=userRegistration.validPassword("Ruchi07#");
        Assert.assertEquals(true,Password);
    }

    @Test
    public void givenPassword_WhenNull_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validPassword("");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Password cannot be null",e.getMessage());
        }

    }

    @Test
    public void givenPassword_WhenNotOfSizeEight_Generate_Exception() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid;
        try {
            valid=userRegistration.validPassword("ruchi");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals("Password must be of size 8",e.getMessage());
        }
    }

}
