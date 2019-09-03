package com.example.demo08.service;

import com.example.demo08.bean.User;
import com.example.demo08.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

/**
 * @author xuchao
 * @date 2019-09-02 -19:15
 **/
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    /**
     * 将这个方法的结果进行缓存,以后要相同的数据直接从缓存中去，不用调用方法
     * CacheManager管理多个Cache组件的,对缓存的真正CRUD操作在Cache组件
     *   @Cacheable的属性
     *   cacheName/value：指定缓存的名字
     *   #root.args[0]
     * cacheManager：指定缓存管理器；或者指定缓存解析器
     * condition：指定符合条件的情况下才缓存
     * unless:否定缓存，当unless指定的条件为true,方法啊的方缓存不会被缓存
     *
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user")
    public User getUser(Integer id){
        System.out.println("查询:"+id+"号员工");
        User user = userRepository.findById(id).get();
      return  user;
    }


    /**
     * CachePut ：既调用方法,又更新缓存
     */
    @CachePut
    public User updateUser(User user){
        return null;
    }

    /**
     * 清除缓存
     * key：指定要清除的数据
     * allEntries = true 清除所有的缓存
     * beforeInvocation = false 缓存的清除是否在方法执行之前
     * 如果出现异常则缓存不会被清除
     * @param id
     */
    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(Integer id){
        System.out.println("deleteEmp:"+id);
    }


    //定义复杂的缓存规则
    @Caching(
            cacheable = {@Cacheable(value = "user",key = "#lastName")},
            put = {@CachePut(value = "user" ,key = "#lastName")}
            )
    public User getUserByName(String lastName){
        //return userRepository.getOne()
        return null;
    }

}
