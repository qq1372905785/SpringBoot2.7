package com.tdcare.boot;

import ch.qos.logback.classic.boolex.OnErrorEvaluator;
import com.tdcare.boot.bean.User;
import com.tdcare.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication      //向SpringBoot声明这是一个启动类
public class MainApplication {
    public static void main(String[] args) {
        //获取到ioc容器对象
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class,args);
        /**
         * containsBean("BeanName")查询Bean是否存在与ioc容器中，返回值是boolean类型
         * **/
        boolean containsBean = ioc.containsBean("dog01");
        System.out.println("dog01是否存在于容器中——————————:"+containsBean);
        boolean containsBean01 = ioc.containsBean("dog02");
        System.out.println("dog02是否存在于容器中——————————:"+containsBean01);

    }
}
