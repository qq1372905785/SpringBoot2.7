package com.tdcare.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller     //用注解声明这是一个Controller类
//@ResponseBody   //这个类的方法都可以返回字符串
@RestController    //RestController是responseBody和Controller的结合体
public class HelloController {
    @ResponseBody       //因为返回的是字符串，所以用@ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello,SpringBoot111";
    }
}
