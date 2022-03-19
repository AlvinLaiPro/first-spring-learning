package com.firstspringlearning.myapp.busness;

import com.firstspringlearning.myapp.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyServiceImpl implements MyService, EnvironmentAware {
    @Value("${service.baseUrl}")
    private String SERVICE_BASEURL;

    private MyRepository repository;
    private Environment environment;

    @Autowired
    public MyServiceImpl(MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void doBusinessLogic() {
        System.out.println("MyService.doBusinessLogic");
        System.out.println("Active profile: " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println(String.format("connect to [%s]", SERVICE_BASEURL));
        repository.doQuery();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
