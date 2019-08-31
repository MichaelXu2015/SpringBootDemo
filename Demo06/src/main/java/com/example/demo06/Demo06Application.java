package com.example.demo06;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan(basePackages = "com.example.demo06.mapper")
 * 的作用是给该包下所有的类都添加@Mapper注解
 */
//@MapperScan(basePackages = "com.example.demo06.mapper")
@SpringBootApplication
public class Demo06Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo06Application.class, args);
    }

}
