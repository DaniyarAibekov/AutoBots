package com.autobots.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityAndDependsOnMethod {
//    @Test(priority = 3)
//    void testA() {
//        System.out.println("Test A");
//    }
//
//    @Test(priority = 1)
//    void testB() {
//        System.out.println("Test B");
//    }
//
//    @Test(priority = 2)
//    void testC() {
//        System.out.println("Test C");
//    }

    @Test(dependsOnMethods = "test2")
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
        Assert.fail();
    }

    @Test(dependsOnMethods = "Test 1")
    void test3() {
        System.out.println("Test 3");
    }
}
