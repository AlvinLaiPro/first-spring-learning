package com.firstspringlearning.myapp.data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MyRepositoryImpl implements MyRepository {
    @Override
    public void doQuery() {
        System.out.println("MyRepository.doQuery");
    }
}
