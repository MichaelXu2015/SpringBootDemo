package com.example.demo01;

import com.example.demo01.bean.Car;
import com.example.demo01.bean.Cat;
import com.example.demo01.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Car car;

    @Autowired
    ApplicationContext ctx;






    @Test
    public void testPerson(){
        System.out.println(person.toString());
    }

    @Test
    public void testCar(){
        System.out.println(car.toString());
    }

    @Test
    public void testCat(){
        // 容器中是否包含cat这个bean 若将 @MyConfig public Car car() 注释掉则为false
        // 使用@ImportSource导入beans.xml里的bean
      boolean isContains =   ctx.containsBean("cat");
        System.out.println(isContains);
    }

    @Test
    public void contextLoads() {
    }

}
