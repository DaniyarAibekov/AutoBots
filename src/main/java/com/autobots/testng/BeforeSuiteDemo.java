package com.autobots.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSuiteDemo {
    @BeforeSuite(alwaysRun = true)
    public void browseConfiguration(){
        System.out.println("Before suite :Window size is : 1920 - 1740");
    }
    @AfterSuite(alwaysRun = true)
    public void browseConfiguration2(){
        System.out.println("After suite : Clear cookies");
    }
}
