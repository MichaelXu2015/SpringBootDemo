package com.example.demo09.controller;

import com.example.demo09.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuchao
 * @date 2019-09-05 -19:27
 **/
@RestController
public class RedisController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/setName/{name}")
    public String setName(@PathVariable("name") String name){
        return redisUtil.set("name",name);
    }

    @RequestMapping("/getName")
    public String getName(){
        return redisUtil.get("name");
    }
}
