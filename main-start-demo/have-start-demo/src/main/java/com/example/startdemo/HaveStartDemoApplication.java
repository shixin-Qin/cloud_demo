package com.example.startdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.startdemo", "com.example.nostartdemo"})
public class HaveStartDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HaveStartDemoApplication.class, args);
    }
    
}
