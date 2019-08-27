package com.example.demo03.controller;

import com.example.demo03.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuchao
 * @date 2019-08-26 -9:56
 * RESTFul风格
 **/
@RestController
public class RESTFulController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping(value = "/addUser")
    public String  addUser(@RequestBody User user){
        logger.info(" addUser === "+user.toString());
        return "success";
    }

    @DeleteMapping(value = "/deleteUser/{userName}")
    public String deleteUserForUsername(@PathVariable("userName") String userName){
        logger.info(" Delete userName === "+userName);
        return "success";
    }

    @PutMapping(value = "/updateUser/{userName}")
    public String updateUserForUserName(@PathVariable("userName") String userName){
        logger.info(" Update userName === "+userName);
        return "success";
    }

    @GetMapping(value = "/getUser/{userName}")
    public String getUser(@PathVariable("userName") String userName){
        logger.info("GetUser userName === "+userName);
        return "success";

    }


    /**
     * 多个参数的写法
     * @param userName
     * @param age
     * @return
     */
    @GetMapping(value = "/getUser2/{userName}/{age}")
    public String getUser2(@PathVariable("userName") String userName,@PathVariable("age") Integer age){
        logger.info("getUser2 userName === "+userName+" age === "+age);
        return "success";

    }

}
