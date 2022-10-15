package com.tdcare.boot;

import com.tdcare.boot.bean.Dog;
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
         * 通过容器的getBean(object,Object.class)方法获取容器中对应的组件类和实例
         * getBean方法的参数分别是实例的名称(id)和实例的类型,也只拿实例类型作为方法的参数
         *
         * **/
        User user01 = ioc.getBean("user01",User.class);
        User user02 = ioc.getBean("user01",User.class);
        System.out.println("用户名是:"+user01.getUserName());
        System.out.println("______________");
        /**
         * 配置类是组件但是并没有在容器中，在容器中的是配置类对象(myconfig)。在proxyBeanMethod为true的时候，myConfig就会变成代理对象
         * 代理对象每次调用注册bean方法的时候Sprinboot就会去容器中检查是否注册了该组件，如果注册了就不会创建新的组件
         * com.tdcare.boot.config.MyConfig$$EnhancerBySpringCGLIB$$ecc2558a@6ad5923a
         */
        System.out.println("user01和user02是:"+(user01==user02));     //输出为true
        MyConfig myConfig = ioc.getBean(MyConfig.class);            //拿到容器中的配置类对象
        System.out.println("myConfig打印输出是:"+myConfig);          //输出看看myConfig是不是代理对象
        /***
         * 可以通过getBeanNamesForType()拿到容器中对应类型的组件名称然后打印 getBeanNamesForType()返回的是字符串数组
         * 也可以通过getBeanDefinitionNames()拿到所有在容器中的组件名称然后打印出来
         * */
        String[] names = ioc.getBeanNamesForType(User.class);
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("______________");
        String[] DefinitionNames = ioc.getBeanDefinitionNames();
        for (String name : DefinitionNames){
            System.out.println(name);
        }
    }
}
