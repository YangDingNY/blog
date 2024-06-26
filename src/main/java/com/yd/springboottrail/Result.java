package com.yd.springboottrail;

import lombok.Data;
import lombok.NonNull;

@Data
public class Result<T> {
    private Integer code;

    private String msg;

    private T data;

    public Result(){

    }

    public Result(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
