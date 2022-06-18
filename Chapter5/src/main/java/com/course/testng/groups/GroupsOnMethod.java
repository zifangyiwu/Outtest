package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups="server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups="client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3");
    }
    @Test(groups="client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4");
    }

    @BeforeGroups(groups = "server")
    public void beforeGroupsOnserver(){
        System.out.println("这是服务端运行之前的方法");
    }
    @AfterGroups(groups = "server")
    public void afterGroupsOnserver(){
        System.out.println("这是服务端运行之后的方法");
    }

    @BeforeGroups(groups = "client")
    public void beforeGroupsOnclient(){
        System.out.println("这是客户端运行之前的方法");
    }
    @AfterGroups(groups = "client")
    public void afterGroupsOnclient(){
        System.out.println("这是客户端运行之后的方法");
    }
}
