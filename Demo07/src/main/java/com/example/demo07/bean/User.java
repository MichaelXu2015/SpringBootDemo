package com.example.demo07.bean;

import javax.persistence.*;

/**
 * @author xuchao
 * @date 2019-08-31 -16:06
 **/
@Entity //表示这是一个实体类
@Table(name = "tbl_user") //指定和哪个数据表对应
public class User {

    @Id //这是一个主键,并且自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name",length = 50) //指定列名
    private String lastName;

    //省略默认使用属性名做为列名
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
