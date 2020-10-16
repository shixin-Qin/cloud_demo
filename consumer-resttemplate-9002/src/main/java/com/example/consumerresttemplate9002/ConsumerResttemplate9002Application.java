package com.example.consumerresttemplate9002;

import com.example.consumerresttemplate9002.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class ConsumerResttemplate9002Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerResttemplate9002Application.class, args);
    }

}
