package com.firstspringlearning.myapp;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void doQuery() {
        System.out.println("MyRepository.doQuery");
    }
}
