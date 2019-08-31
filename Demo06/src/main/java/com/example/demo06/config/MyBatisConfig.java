package com.example.demo06.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuchao
 * @date 2019-08-31 -15:30
 **/
@Configuration
public class MyBatisConfig {


    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //开启驼峰命名规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
