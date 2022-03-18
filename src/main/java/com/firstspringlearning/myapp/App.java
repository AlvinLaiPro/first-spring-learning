package com.firstspringlearning.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  App {
    public static void main(String[] args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService bean = cxt.getBean(MyService.class);
        bean.doBusinessLogic();
    }
}
