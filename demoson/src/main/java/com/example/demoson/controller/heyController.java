package com.example.demoson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class heyController {

    @RequestMapping("/sayHey")
    public String hey(){
        String hey = "hey";
        return hey;
    }
}
