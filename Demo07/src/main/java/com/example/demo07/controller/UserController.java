package com.example.demo07.controller;
import com.example.demo07.bean.User;
import com.example.demo07.repository.UserRepository;
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
    UserRepository userRepository;



    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
       User user = userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/user")
    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }


    @GetMapping("/userList")
    public List<User> userList(){
        return userRepository.userList();
    }




}
