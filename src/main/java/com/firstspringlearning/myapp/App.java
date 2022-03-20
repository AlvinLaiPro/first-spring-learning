package com.firstspringlearning.myapp;

import com.firstspringlearning.myapp.busness.OrderService;
import com.firstspringlearning.myapp.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  App {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService service = cxt.getBean(OrderService.class);

        service.placeOrder();
    }
}
