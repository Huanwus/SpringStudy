package com.kaung.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 等级我们会用这个类自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {


    // 被代理的接口
    private Lease lease;
    public void setLease(Lease lease) {
        this.lease = lease;
    }

    // 生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), lease.getClass().getInterfaces(),this );
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();

        // 动态代理的本质就是使用反射机制实现
        Object result = method.invoke(lease, args);

        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带你去看房子");
    }

    public void fare(){
        System.out.println("中介收房租");
    }
}
