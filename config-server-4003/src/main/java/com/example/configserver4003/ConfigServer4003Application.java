package com.example.configserver4003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServer4003Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer4003Application.class, args);
    }

}
