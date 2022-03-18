package com.firstspringlearning.myapp;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
    public void doQuery() {
        System.out.println("MyRepository.doQuery");
    }
}
