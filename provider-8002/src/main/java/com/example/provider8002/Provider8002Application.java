package com.example.provider8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
//表示开启Fegin客户端
@EnableFeignClients
@SpringBootApplication
public class Provider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8002Application.class, args);
    }

}
