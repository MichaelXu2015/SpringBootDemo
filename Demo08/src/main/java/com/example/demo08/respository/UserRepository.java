package com.example.demo08.respository;

import com.example.demo08.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuchao
 * @date 2019-08-31 -16:11
 *
 **/

//@Repository JPA的操作类 继承JpaRepository
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {





}
