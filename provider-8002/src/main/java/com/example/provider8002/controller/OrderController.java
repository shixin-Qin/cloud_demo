package com.example.provider8002.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/one")
    public String one() {
        return "取自provider-8002的order";
    }

}
