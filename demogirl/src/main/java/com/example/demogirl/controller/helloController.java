package com.example.demogirl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello world! --这里返回的是String";
    }
}
