package com.example.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认两种全局配置文件
 * 1.application.properties
 * 2.application.yml
 *
 * 若项目中同时存在以上两个配置文件,则会优先加载application.properties
 *
 * 将bean加入到容器的几种注解（前提是配置了@ComponentScan 扫描了包括bean的包）
 * @Controller,@Service,@Resporit @Bean @ImportSource
 *
 * 使用命令行的方式指定运行的环境
 * java -jar xxx.jar --spring.profiles.active=dev
 */
@SpringBootApplication
public class Demo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

}
