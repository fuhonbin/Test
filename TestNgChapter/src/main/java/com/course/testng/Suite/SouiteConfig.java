package com.course.testng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SouiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("Befor Suite运行了！");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite运行了！");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("BeforTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
