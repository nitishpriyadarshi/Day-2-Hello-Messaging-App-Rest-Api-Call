package com.bridgelabz.hellomessagingapprestapicall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return " Hello From BridgeLabz ";
    }
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayHello(){
        return "My name is Nitish Priyadarshi";
    }

}
