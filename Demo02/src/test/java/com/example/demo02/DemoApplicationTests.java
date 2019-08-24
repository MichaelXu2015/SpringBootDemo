package com.example.demo02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    /**
     * Logger 日志级别,由低到高
     * trace --> debug --> info --> warn --> error
     * springboot 的日志级别默认是info级别
     */

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.trace(" trace ");
        logger.debug(" debug ");
        logger.info(" info ");
        logger.warn(" warn ");
        logger.error(" error ");
    }

}
