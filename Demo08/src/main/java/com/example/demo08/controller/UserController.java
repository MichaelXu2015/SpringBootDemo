package com.example.demo08.controller;

import com.example.demo08.bean.User;
import com.example.demo08.respository.UserRepository;
import com.example.demo08.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuchao
 * @date 2019-08-31 -16:20
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;



    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUser(id);
        return user;
    }






}
