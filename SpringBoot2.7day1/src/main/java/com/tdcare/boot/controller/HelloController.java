package com.tdcare.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller     //用注解声明这是一个Controller类
//@ResponseBody   //这个类的方法都可以返回字符串
@RestController    //RestController是responseBody和Controller的结合体
//@RequestMapping("/helloMapping")
public class HelloController {
    @Value("${country}")
    private String country1;    //返回的是String类型，所以用String类型接收
    @Value("${user.names}")
    private String name1;
    @Value("${likes[2]}")
    private String like;
    @Value("${likes01[2]}")
    private String like01;
    @Value("${users[1].age}")
    private String useage01;
    @Value("${users01[1].age}")
    private String usersage01;
    @Value("${server.port}")
    private Integer serverPort;
//    @ResponseBody       //因为返回的是字符串，所以用@ResponseBody
    @RequestMapping("/hello")
   /* @GetMapping*/
    public String hello(){
        System.out.println("country====>"+country1);
        System.out.println("name====>"+name1);
        System.out.println("like====>"+like);
        System.out.println("like01====>"+like01);
        System.out.println("user.age====>"+useage01);
        System.out.println("user01.age====>"+usersage01);
        System.out.println("server.Port====>"+serverPort);
        return "hello,SpringBoot...runing....";
    }

}
