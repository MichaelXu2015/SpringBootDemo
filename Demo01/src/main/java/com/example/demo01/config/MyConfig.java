package com.example.demo01.config;

import com.example.demo01.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuchao
 * @date 2019-08-23 -9:59
 * 1.@Configuration 相当于bean.xml配置类
 * 2.@ImportResource({"classpath:beans.xml"}) 将beans.xml里的bean加入到容器中
 **/
//@ImportResource({"classpath:beans.xml"})
@Configuration //标记这是一个配置类
public class MyConfig {


    /**
     * @Bean 将Cat注入到容器中
     * @Bean 相当于bean.xml里的<bean><bean/>标签
     * 可以指定bean的id,若没有指定默认为方法名
     * @return
     */
    @Bean(name = "cat")
    public Cat cat(){
        return new Cat();
    }
}
