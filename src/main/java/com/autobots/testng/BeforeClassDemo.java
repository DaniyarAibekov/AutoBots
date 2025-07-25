package com.autobots.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassDemo extends BeforeSuiteDemo {

    @BeforeClass
    public void openBaseUrl(){
        System.out.println("BeforeClassDemo -- Open aviasales.kg");
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
    @AfterClass
    public void closeBaseUrl(){
        System.out.println("BeforeClassDemo -- Close aviasales.kg");
    }
}
