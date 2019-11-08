package com.example.loggindemo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoTest {
     Logger logger = LoggerFactory.getLogger(DaoTest.class);



    public void testDaoLog(){
        System.out.println(" -------testDaoLog  ");
        logger.trace(" dao trace");
        logger.debug("dao debug");
        logger.info("dao info");
        logger.warn("dao warn");
        logger.error("dao error");
    }
}
