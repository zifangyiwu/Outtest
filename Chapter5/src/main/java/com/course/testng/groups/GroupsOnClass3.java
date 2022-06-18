package com.course.testng.groups;

import org.testng.annotations.Test;

public class GroupsOnClass3 {
    @Test(groups = "teacher")
    public void teacher1() {
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
    @Test(groups = "teacher")
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
