package com.firstspringlearning.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class  App {
    public static void main(String[] args) {
        ApplicationContext cxt = new FileSystemXmlApplicationContext("application-context.xml");
    }
}
