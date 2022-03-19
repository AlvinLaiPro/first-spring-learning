package com.firstspringlearning.myapp.busness;

import com.firstspringlearning.myapp.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Value("${my.name}")
    private String myName;

    private MyRepository repository;

    @Autowired
    public MyServiceImpl(MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void doBusinessLogic() {
        System.out.println("MyService.doBusinessLogic by " + myName);
        repository.doQuery();
    }
}
