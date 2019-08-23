package com.example.demo01.bean;

import org.springframework.stereotype.Component;

/**
 * @author xuchao
 * @date 2019-08-23 -9:56
 **/


public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
