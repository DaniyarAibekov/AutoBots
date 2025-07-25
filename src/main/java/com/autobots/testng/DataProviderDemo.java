package com.autobots.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class DataProviderDemo {

    @DataProvider(name = "loginDate")
    public Object [][] loginDate(){
        return new Object[][]{
                {"admin","validPassword"},
                {"invalidUsername","invalidPassword"},
                {"validUsername","InvalidPaswword"},
                {"invalidUsername","validPassword"},
        };
    }

    @Test(dataProvider = "loginDate")
    void loginWithValidUsernameAndPassword(String username,String password){
        System.out.println("Testing the login with: " + username + " and password: " + password);
    }

}
