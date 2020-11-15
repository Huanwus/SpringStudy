package com.kaung.demo01;

public class Client {
    public static void main(String[] args) {
        // 传统的做法
//        Host host = new Host();
//        host.lease();

        // 代理的方式
        // 代理一般有其他的附属操作，就是我们所谓的琐事
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.lease();
    }
}
