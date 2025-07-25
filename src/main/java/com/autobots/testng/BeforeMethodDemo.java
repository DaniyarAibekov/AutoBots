package com.autobots.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodDemo extends BeforeSuiteDemo{

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethodDemo -- Generate random UUID email");
        System.out.println("BeforeMethodDemo -- Open aviasales.kg");
    }

    @Test
    void test (){
        System.out.println("Ticket to Turkey");
        Assert.assertTrue(true);
    }
    @Test
    void test1 (){
        System.out.println("Ticket to Italy");
        Assert.assertTrue(true);
    }
    @Test
    void test2 (){
        System.out.println("Ticket to Thailand");
        Assert.assertTrue(true);
    }
    @AfterMethod
    public void closeBaseUrl(){
        System.out.println("BeforeMethodDemo -- Close aviasales.kg");
    }
    @BeforeMethod
    public void openBaseMethod(){
        System.out.println("BeforeMethodDemo -- Before method");
    }
    @AfterMethod
    public void closeBaseMethod(){
        System.out.println("BeforeMethodDemo -- After method");
    }
}
