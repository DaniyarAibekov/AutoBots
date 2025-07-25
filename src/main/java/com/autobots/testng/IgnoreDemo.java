package com.autobots.testng;

import org.testng.annotations.Test;

public class IgnoreDemo {
    @Test
    void test1(){
        System.out.println("Test 1");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2");
    }
    @Test
    void test3(){
        System.out.println("Test 3");
    }
    @Test
    void test4(){
        System.out.println("Test 4");
    }
    @Test
    void test5(){
        System.out.println("Test 5");
    }
}
