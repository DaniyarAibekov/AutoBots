package com.autobots.testng;

import org.testng.annotations.Test;

public class LoginTestDemo {

    @Test(groups = {"loginTest"})
    void loginWithValidCreds(){
        System.out.println("LoginTestDemo --> login with valid creds");
    }
    @Test(groups = {"loginTest"})
    void loginWithValidUserNameAndInvalidPassword(){
        System.out.println("LoginTestDemo --> login with valid username and invalid password");
    }
    @Test(groups = {"loginTest"})
    void loginWithInvalidUserNameAndValidPassword(){
        System.out.println("LoginTestDemo --> login with invalid username and valid password");
    }
    @Test(groups = {"loginTest"})
    void loginWithInvalidUserNameAndInvalidPassword(){
        System.out.println("LoginTestDemo --> login with invalid username and invalid password");
    }

    @Test(groups = {"registerTest"})
    void registerWithValidDate(){
        System.out.println("Register with valid date");
    }
    @Test(groups = {"registerTest"})
    void registerWithInvalidDate(){
        System.out.println("Register with invalid date");
    }


}
