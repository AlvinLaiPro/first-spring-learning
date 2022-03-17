package com.firstspringlearning.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

public class  App {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("application-context.xml");
        MyService bean1 = cxt.getBean(MyService.class);
        MyService bean2 = cxt.getBean(MyService.class);
        boolean isSameBean = bean1 == bean2; // false
        System.out.println("bean1 is equal to bean2: " + isSameBean);
    }
}
