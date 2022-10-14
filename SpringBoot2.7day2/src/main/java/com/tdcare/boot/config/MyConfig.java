package com.tdcare.boot.config;

import com.tdcare.boot.bean.Dog;
import com.tdcare.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      //用注解声明这是一个配置类
public class MyConfig {
    @Bean
    public User user03(){       //方法名对应的就是实例的id
        User user02 = new User("ljh",22,new Dog());
        return user02;
    }
//    @Bean(name = "dog") //可以起别名
    @Bean
    public Dog dog01(){     //方法名对应的就是实例的id
        Dog dog01 = new Dog("xiaomi",7);
        return dog01;
    }
}
