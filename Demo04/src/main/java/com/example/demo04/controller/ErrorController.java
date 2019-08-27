package com.example.demo04.controller;

import com.example.demo04.enums.ErrorEnum;
import com.example.demo04.expection.MyException;
import com.example.demo04.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuchao
 * @date 2019-08-27 -19:19
 **/
@RestController
public class ErrorController {


    @Autowired
    MyService myService;

    @RequestMapping("/testError")
    public String testError(){
        int i = 1/0; //此处抛出异常，会被MyControllerAdvice里的globalErrorHandler拦截
        return "success";
    }


    @RequestMapping("/testMyExceptionError")
    public String testMyExceptionError() {
        String userName = "";//从redis从获取userName
        if(StringUtils.isEmpty(userName)){
            throw new MyException(ErrorEnum.USER_NOT_LOGIN.getMsg());
        }
        return "success";
    }


    @RequestMapping("/testServiceError")
    public String testServiceError(){
        myService.testServiceError();
        return "success";
    }
}
