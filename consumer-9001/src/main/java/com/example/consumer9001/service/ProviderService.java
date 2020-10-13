package com.example.consumer9001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//name 为provider项目中application.yml配置文件中的application.name;
//path 为provider项目中application.yml配置文件中的context.path;
@FeignClient(name = "provider-server",path ="/provider" )
@Component
public interface ProviderService {

    @RequestMapping(value = "/order/one")
    String one();

}
