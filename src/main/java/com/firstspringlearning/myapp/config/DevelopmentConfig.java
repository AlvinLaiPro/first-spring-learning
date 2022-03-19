package com.firstspringlearning.myapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("local")
@Configuration
@ComponentScan(value = "com.firstspringlearning.myapp")
@PropertySource("classpath:application-local.properties")
public class DevelopmentConfig {
}
