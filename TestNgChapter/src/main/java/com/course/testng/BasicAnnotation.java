package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解  用来把方法标记为测试的一部分
   @Test
    public void case1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void case2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void BeFroeMethod(){
        System.out.println("BeFroeMethod这是在测试方法前运行的标签！");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在测试方法后运行的标签！");
    }
    @BeforeClass
    public void beforClass(){
    System.out.println("beforClass这是在类运行前运行的标签！");
}
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行后运行后运行的标签！");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }


}
