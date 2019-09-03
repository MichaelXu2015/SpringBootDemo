package com.example.demo08.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * @author xuchao
 * @date 2019-09-02 -19:07
 **/
@Configuration
public class MyCacheConfig {


    @Bean("mykeyGenerator")
    public KeyGenerator keyGenerator(){
       return new KeyGenerator(){

            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName()+"["+ Arrays.asList(params).toString()+"]";
            }
        };
    }
}
