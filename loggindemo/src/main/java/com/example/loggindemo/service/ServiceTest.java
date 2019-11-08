package com.example.loggindemo.service;

import com.example.loggindemo.dao.DaoTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceTest {

    Logger logger = LoggerFactory.getLogger(ServiceTest.class);



    public void testServiceLog(){
        System.out.println(" -------testServiceLog  ");
        logger.trace(" service trace");
        logger.debug("service debug");
        logger.info("service info");
        logger.warn("service warn");
        logger.error("service error");
    }
}
