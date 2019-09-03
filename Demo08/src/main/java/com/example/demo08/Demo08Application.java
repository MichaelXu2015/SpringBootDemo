package com.example.demo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * SpringBoot缓存
 * 主要通过CacheAutoConfiguration来配置缓存
 * 1.方法运行之前,先去查询Cache(缓存组件),按照cacheNames指定的名字获取
 *    CacheManager先获取相应的缓存,第一次获取缓存没有Cache组件会自动创建
 * 2.去Cache中查找缓存的内容,使用一个key默认是方法参数
 * @EnableCaching 开启缓存
 */
@EnableCaching
@SpringBootApplication
public class Demo08Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo08Application.class, args);
    }

}
