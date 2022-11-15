package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class RestExceptionHandler {
    /**
     * 默认全局异常处理。
     * @param e the e
     * @return ResultData
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ResultData<String> exception(Exception e) {
        return ResultData.fail(ReturnCode.RC500.getCode(),e.getMessage());
    }


    /**
     * NoHandlerFoundException 异常捕获处理
     * 请求的接口不存在
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultData<String> noHandlerFoundExceptionHandler(NoHandlerFoundException e){
        return ResultData.fail(ReturnCode.RC404.getCode(),ReturnCode.RC404.getMessage());
    }


}
