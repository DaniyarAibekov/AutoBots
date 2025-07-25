package com.autobots.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

    @Test
    @Parameters({"browser","username", "password"})
    void buyIphoneTest(String browser , String username, String password){
        System.out.println(browser + "browser Test: buy Iphone" + "\n" +
                           username + "username Test: buy Iphone" + "\n" +
                           password + "password Test: buy Iphone"
        );
    }
    @Test
    @Parameters("browser")
    void buySamsungTest(String browser){
        System.out.println(browser + "browser Test: buy  Samsung");
    }
    @Test
    @Parameters("browser")
    void buyRedmeTest(String browser){
        System.out.println(browser + "browser Test: buy  Redme");
    }
    @Test
    @Parameters("browser")
    void buyNokiaTest(String browser){
        System.out.println(browser + "browser Test: buy  Nokia");
    }
    @Test
    @Parameters("browser")
    void buyFonexTest(String browser){
        System.out.println(browser + "browser Test: buy  Fonex");
    }
}
