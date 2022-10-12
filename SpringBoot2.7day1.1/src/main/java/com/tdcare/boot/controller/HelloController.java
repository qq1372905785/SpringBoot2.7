package com.tdcare.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ResponseBody       //因为返回的是字符串，所以用@ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello,SpringBoot2.7";
    }
}
