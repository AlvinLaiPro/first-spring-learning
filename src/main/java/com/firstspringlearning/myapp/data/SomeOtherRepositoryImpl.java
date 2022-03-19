package com.firstspringlearning.myapp.data;

import org.springframework.stereotype.Repository;

@Repository
public class SomeOtherRepositoryImpl implements MyRepository {
    @Override
    public void doQuery() {
        System.out.println("SomeOtherRepositoryImpl.doQuery");
    }
}
