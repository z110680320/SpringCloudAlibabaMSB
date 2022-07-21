package com.mashibing.cloudalibabanacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@Value("${server.port}")
String port;
    @RequestMapping("helloNacos")
    public String helloNacos(){

        System.out.println(port);
        System.out.println("hello  nacos  ssssss");
        return port;

    }
}
