package com.firstspringlearning.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    MyRepository repository;

    @Autowired
    public void MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void doBusinessLogic() {
        System.out.println("MyService.doBusinessLogic");
        repository.doQuery();
    }
}
