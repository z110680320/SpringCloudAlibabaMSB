package com.example.loudalibabaconsumernacos8083.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Value("${service-url.nacos-user-service}")
    String port;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("helloNacos")
    public String helloNacos(){
        return restTemplate.getForObject(port+"helloNacos",String.class);
    }
}
