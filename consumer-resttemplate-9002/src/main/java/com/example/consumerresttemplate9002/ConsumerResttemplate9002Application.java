package com.example.consumerresttemplate9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsumerResttemplate9002Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerResttemplate9002Application.class, args);
    }

}
