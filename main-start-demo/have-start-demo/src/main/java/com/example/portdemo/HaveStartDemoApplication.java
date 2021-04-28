package com.example.portdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.portdemo","com.example.noportdemo"})
public class HaveStartDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HaveStartDemoApplication.class, args);
    }
    
}
