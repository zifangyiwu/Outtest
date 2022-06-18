package com.course.testng.groups;

import org.testng.annotations.Test;

public class GroupsOnClass1 {
    @Test(groups="stu")
        public void stu1(){
            System.out.println("GroupsOnClass1中的stu1运行");
        }
    @Test(groups="stu")
        public void stu2(){
            System.out.println("GroupsOnClass1中的stu2运行");
        }
}
