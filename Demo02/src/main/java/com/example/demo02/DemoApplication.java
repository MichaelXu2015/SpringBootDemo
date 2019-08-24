package com.example.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 该章节演示SpringBoot如何使用log
 *
 * 0.Logger 日志级别,由低到高
 *   trace --> debug --> info --> warn --> error
 *   springboot 的日志级别默认是info级别
 *
 * 1.在application.properties中添加以下配置
 * #指定哪个包下使用的基本，trace为都能打印
 * logging.level.com.example=trace
 *
 * #将日志保存到当前项目下
 * logging.file=springboot.log
 *
 * #将日志保存到指定路径
 * #logging.file=D:/springboot.log
 *
 * #将日志保存到当前项目所的盘符+/spring/log/springboot.log
 * #logging.path=/spring/log
 *
 * #日志在控制台打印的格式
 * #logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{50} - %msg%n
 *
 * #日志在文件中输出的格式
 * #logging.pattern.file=%d{yyyy-MM-dd HH:mm:ss} == [%thread] == %-5level %logger{50} - %msg%n
 *
 * =========================================================================
 *
 * 2.在resources下添加logback.xml文件,具体配置去logback.xml中配置
 * 3.在resources下添加logback-spring.xml文件添加
 *   <!-- 开发环境打印格式 -->
 *   <springProfile name="dev">
 *         <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} ------> [%thread] %-5level %logger{50} - %msg%n</pattern>
 *   </springProfile>
 *
 *    <!-- 非开发环境打印格式 -->
 *   <springProfile name="!dev">
 *        <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} ======= [%thread] %-5level %logger{50} - %msg%n</pattern>
 *   </springProfile>
 * 4.logback.xml 和 logback-spring.xml 区别就是后者能指定环境输出格式
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
