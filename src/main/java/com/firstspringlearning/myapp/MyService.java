package com.firstspringlearning.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    MyRepository repository;

    public void doBusinessLogic() {
        repository.doQuery();
    }
}
