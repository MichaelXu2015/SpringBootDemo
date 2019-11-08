package com.example.loggindemo.controller;

import com.example.loggindemo.dao.DaoTest;
import com.example.loggindemo.service.ServiceTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingTest {

    ServiceTest serviceTest = new ServiceTest();
    DaoTest daoTest = new DaoTest();


    @GetMapping("/testDaoLog")
    public String testDaoPackageLog(){
        daoTest.testDaoLog();
        return "dao test";
    }

    @GetMapping("/testServiceLog")
    public String testServicePackageLog(){
        serviceTest.testServiceLog();
        return "service test";
    }
}
