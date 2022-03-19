package com.firstspringlearning.myapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.firstspringlearning.myapp")
@PropertySource(value = "application.properties")
public class AppConfig {
}
