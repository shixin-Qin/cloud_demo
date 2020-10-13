package com.example.consumer9001.controller;

import com.example.consumer9001.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private ProviderService providerService;

    @RequestMapping(value = "/one")
    public String getConsumer() {
        String str = providerService.one();
        return str;
    }
}
