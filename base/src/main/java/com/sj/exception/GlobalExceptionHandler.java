package com.sj.exception;

import com.sj.util.ResponseResult;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

public class GlobalExceptionHandler {
    /**
     * 引发指定异常后，返回自定义对象
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class) // 要捕获的异常类型
    @ResponseBody
    public ResponseResult defaultExceptionHandler(HttpServletRequest req, Exception e){
        ResponseResult result = new ResponseResult();
        result.setCode(20001); // 自定义错误编号，返回前台用
        // ResponseResult新增了message属性，用来统一向前台传递后台的处理消息
        result.setMessage("权限不足");
        return result;
    }

    // 还可以写其他的，错误代码和消息都可以自定义
}
