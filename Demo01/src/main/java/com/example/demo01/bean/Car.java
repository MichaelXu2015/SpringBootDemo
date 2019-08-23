package com.example.demo01.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;

/**
 * @author xuchao
 * @date 2019-08-23 -9:39
 * 使用Spring底层注解@Value为Bean赋值
 * 使用@Value("${}")可以引用.properties里的值
 * 可以使用@Validated 检验字段是否合法
 **/
@Component
@ConfigurationProperties(prefix = "car")
@Validated
public class Car {

    //引用properties里的值
    @Value("${car.name}")
    private String name;

    @Value("#{115.55*15}")
    private double price;

    @Value("2015/01/01")
    private Date date;

    //检验是否是邮件格式
    @Email
    @Value("${car.email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", email='" + email + '\'' +
                '}';
    }
}
