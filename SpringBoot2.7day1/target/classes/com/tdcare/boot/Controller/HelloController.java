package com.tdcare.boot.controller;

import com.tdcare.boot.bean.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.PrimitiveIterator;

//@Controller     //用注解声明这是一个Controller类
//@ResponseBody   //这个类的方法都可以返回字符串
@RestController    //RestController是responseBody和Controller的结合体
//@RequestMapping("/helloMapping")
public class HelloController {
    //引用application配置文件的字段值
    @Value("${country}")        //用espl表达式获取配置文件里面的字段
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
    private String serverPort;
    @Value("${tempDir}")
    private String tempDir;
    @Value("${showDir}")
    private String showDir;
    @Autowired
    private MyDataSource myDataSource;
    /**
     *通过Environment获取配置文件的所有属性数据
     * 上面要加@Autowired自动注入
     * 然后通过getProperty()方法获取属性
     * */
    @Autowired
    private Environment env;    //inwairuiment(读音)
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
        System.out.println("tempDir====>"+tempDir);
        System.out.println("tempDir====>"+showDir);
        System.out.println("environment====>"+env.getProperty("tempDir"));
        System.out.println("environment.name====>"+env.getProperty("user.names"));
        System.out.println("environment.name====>"+env.getProperty("users01[1].age"));
        System.out.println("myDataSource.getDrive()====>"+myDataSource);
        return "hello,SpringBoot...runing....";
    }

}
