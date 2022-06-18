package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCourse1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCourse2(){
       System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
       System.out.println("beforeMethod是测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
       System.out.println("afterMethod是测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
       System.out.println("beforeClass是类之前运行的");
    }
    @AfterClass
    public void afterClass(){
       System.out.println("afterClass是类之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite是测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite是测试套件");
    }
}
