package com.tdcare.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication      //用注解的方式向SpringBoot声明这是一个主程序类
public class MainApplication {
    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class,args);      //用SpringApplication.run方法启动参数是类的类型和args字符串
    }
}
