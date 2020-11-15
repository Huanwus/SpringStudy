package com.kaung.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象
        pih.setLease(host);


        // 这里的proxy就是动态生成的, 我们并没有写
        Lease proxy = (Lease) pih.getProxy();
        proxy.lease();
    }
}
