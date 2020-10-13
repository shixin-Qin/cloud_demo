package com.example.consumerresttemplate9002.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    private static final String REST_URL_PREFIX = "http://localhost:8001/provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/one")
    public String one() {
        String str = restTemplate.getForObject(REST_URL_PREFIX + "/order/one",String.class);
        return str;
    }

}
