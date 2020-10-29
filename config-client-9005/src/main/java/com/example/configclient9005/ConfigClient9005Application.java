package com.example.configclient9005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClient9005Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9005Application.class, args);
    }

}
