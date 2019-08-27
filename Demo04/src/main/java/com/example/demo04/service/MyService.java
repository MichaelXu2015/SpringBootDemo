package com.example.demo04.service;

import org.springframework.stereotype.Service;

/**
 * @author xuchao
 * @date 2019-08-27 -19:41
 **/
@Service
public class MyService {

    String s = null;

    public void testServiceError(){
        int len = s.length();//NullPointException
    }
}
