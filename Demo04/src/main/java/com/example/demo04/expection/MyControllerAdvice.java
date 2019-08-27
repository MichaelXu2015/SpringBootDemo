package com.example.demo04.expection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuchao
 * @date 2019-08-27 -19:12
 * SpringBoot异常处理
 **/
@ControllerAdvice
public class MyControllerAdvice {

    Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * 拦截全局异常
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value =Exception.class)
    public Map globalErrorHandler(HttpServletRequest request, HttpServletResponse response,Exception e){
        logger.info(" code1 ==== "+response.getStatus());
        Map<String,Object> map = new HashMap<>();
        map.put("code",400);
        map.put("msg",e.getMessage());
        return map;
    }


    /**
     * 拦截指定异常
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value =MyException.class)
    public Map myExceptionHandler(HttpServletRequest request, HttpServletResponse response,Exception e){
        logger.info(" code1 ==== "+response.getStatus());
        Map<String,Object> map = new HashMap<>();
        map.put("code",401);
        map.put("msg",e.getMessage());
        return map;
    }

}



