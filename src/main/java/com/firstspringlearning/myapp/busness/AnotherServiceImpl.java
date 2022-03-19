package com.firstspringlearning.myapp.busness;

import com.firstspringlearning.myapp.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class AnotherServiceImpl implements MyService {

    private MyRepository repository;

    @Autowired
    public AnotherServiceImpl(@Qualifier(value = "someOtherRepositoryImpl") MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void doBusinessLogic() {
        System.out.println("AnotherServiceImpl.doBusinessLogic");
        repository.doQuery();
    }
}
