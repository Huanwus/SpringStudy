package com.kaung.demo02;

public class Client {
    public static void main(String[] args) {
//        // 原来的做法
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();

        // 用代理模式，我们在没有动原来代码的情况下，增加了新的功能
        // 改变原来的业务代码是公司的大忌
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(userService);
        proxy.add();
    }
}
