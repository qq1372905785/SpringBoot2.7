package com.tdcare.boot;

import com.tdcare.boot.bean.Dog;
import com.tdcare.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //获取到ioc容器对象
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class,args);
        //通过容器对象获取所有容器中的组件名称
        String[] iocNames = ioc.getBeanDefinitionNames();
        //用增强for循环打印获取到的对象名称
        for (String name : iocNames){
            System.out.println(name);       //打印之后可以看到user03和dog01已经在容器中了
        }
        /**
         * 通过getBean获取容器中的bean组件
         * getBean方法的参数分别是实例的名称(id)和实例的类型
         * **/
        System.out.println("______________________");
        User user01 = ioc.getBean("user03", User.class);
        Dog dog01 = ioc.getBean("dog01", Dog.class);
        System.out.println("用户名是"+user01.getUserName());
        System.out.println("用户名是"+dog01.getName());
    }
}
