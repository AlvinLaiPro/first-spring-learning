package com.firstspringlearning.myapp;

public class MyService {

    private MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void doBusinessLogic() {
        System.out.println("MyService.doBusinessLogic");
        repository.doQuery();
    }
}
