package com.tdcare.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //http://localhost:8080/hello1?saveValue="你要的参数"
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)   //需要改成get类型的请求才能在链接带参数
    public String helloSave(String saveValue){
        return saveValue+"Hello";
    };
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello";
    };
}
