package com.firstspringlearning.myapp;

public class MyService {

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    MyRepository repository;

    public void doBusinessLogic() {
        repository.doQuery();
    }
}
