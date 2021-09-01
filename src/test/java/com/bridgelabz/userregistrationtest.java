package com.bridgelabz;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.Test;

public class userregistrationtest{

    @Test
    public void isFirstName_Valid_ifValid_return_true() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName=userRegistration.validFirstName("Ruchi");
        Assert.assertEquals(true,firstName);

    }

    @Test
    public void isLastName_Valid_ifValid_return_true() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName=userRegistration.validLastName("Mandve");
        Assert.assertEquals(true,lastName);

    }

    @Test
    public void isEmailName_Valid_ifValid_return_true() {
        UserRegistration userRegistration = new UserRegistration();
        boolean Email=userRegistration.validEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,Email);

    }
}
