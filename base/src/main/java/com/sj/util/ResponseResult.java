package com.sj.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResponseResult {
    private Integer code = 20000; //返回前段的状态码，20000返回成功
    private Map<String,Object> data=new HashMap<>();
    private String message="默认设置";
}
