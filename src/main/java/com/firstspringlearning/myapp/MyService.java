package com.firstspringlearning.myapp;

public class MyService {

    MyRepository repository;

    public void doBusinessLogic() {
        repository.doQuery();
    }

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
