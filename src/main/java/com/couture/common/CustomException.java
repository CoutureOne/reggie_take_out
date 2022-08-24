package com.couture.common;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description: 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
