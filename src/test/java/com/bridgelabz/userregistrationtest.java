package com.bridgelabz;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.Test;

public class userregistrationtest{

    @Test
    public void isFirstName_Valid_ifValid_return_true() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email1=userRegistration.validFirstName("Ruchi");
        Assert.assertEquals(true,email1);

    }



}
