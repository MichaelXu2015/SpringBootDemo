package com.example.demo04.expection;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author xuchao
 * @date 2019-08-27 -19:57
 **/
@Component
public class ErrorPageRegistrar implements org.springframework.boot.web.server.ErrorPageRegistrar {


    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        //拦截404错误 ,测试未通过
       /* ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404");
        registry.addErrorPages(e404);*/
    }
}
