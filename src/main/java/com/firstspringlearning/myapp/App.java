package com.firstspringlearning.myapp;

import com.firstspringlearning.myapp.busness.AnotherServiceImpl;
import com.firstspringlearning.myapp.busness.MyService;
import com.firstspringlearning.myapp.busness.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  App {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "local");
        ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service1 = cxt.getBean(MyServiceImpl.class);
        MyService service2 = cxt.getBean(AnotherServiceImpl.class);

        service1.doBusinessLogic();
        service2.doBusinessLogic();
    }
}
