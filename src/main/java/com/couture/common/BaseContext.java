package com.couture.common;

/**
 * @author Couture
 * @data: 2022/8/23
 * @description: 基于ThreadLocal封装工具类，用户保存和获取当前用户登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
