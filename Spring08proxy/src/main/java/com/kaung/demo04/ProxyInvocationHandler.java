package com.kaung.demo04;

import com.kaung.demo03.Lease;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 相对于demo03, 这里我们这里把动态代理改得更为灵活了.
// 等级我们会用这个类自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {


    // 被代理的接口
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this );
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        // 动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
