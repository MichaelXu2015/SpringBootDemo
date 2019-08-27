package com.example.demo04.enums;

/**
 * @author xuchao
 * @date 2019-08-27 -19:32
 **/
public enum  ErrorEnum {

    USER_NOT_LOGIN(6001,"用户未登录"),
    USER_ARE_FROZEN(6002,"用户被冻结了");

    //......


    private Integer code;
    private String msg;

    ErrorEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
