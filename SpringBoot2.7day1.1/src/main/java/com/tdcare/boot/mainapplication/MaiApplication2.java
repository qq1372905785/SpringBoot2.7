package com.tdcare.boot.mainapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
* 修改包扫描的几种方式
* 包扫描主要是扫描controller的包的注解，在默认情况下是扫描主程序同层级和主程序下的子包
 * 如果修改了主程序或者controller的包的位置，则需要用自定义扫描
* */
//@SpringBootApplication(scanBasePackages = "com.tdcare.boot.controller")   自定义扫描
/*@SpringBootApplication
@ComponentScan("com.tdcare.boot.controller")自定义扫描*/
public class MaiApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(MaiApplication2.class,args);
    }
}
