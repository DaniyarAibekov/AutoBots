package com.autobots.testng;

import org.testng.annotations.Test;

public class GroupsDemo {
    @Test(groups = {"loginTest"})
    void loginWithValidCreds(){
        System.out.println("login with valid creds");
    }
    @Test(groups = {"loginTest"})
    void loginWithValidUserNameAndInvalidPassword(){
        System.out.println("login with valid username and invalid password");
    }
    @Test(groups = {"loginTest"})
    void loginWithInvalidUserNameAndValidPassword(){
        System.out.println("login with invalid username and valid password");
    }
    @Test(groups = {"loginTest"})
    void loginWithInvalidUserNameAndInvalidPassword(){
        System.out.println("login with invalid username and invalid password");
    }
}
