package com.example.demo07.repository;

import com.example.demo07.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xuchao
 * @date 2019-08-31 -16:11
 *
 **/

//@Repository JPA的操作类 继承JpaRepository
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
