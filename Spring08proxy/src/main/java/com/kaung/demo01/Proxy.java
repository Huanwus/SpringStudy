package com.kaung.demo01;

public class Proxy implements Lease {
    private Host host;

    public Proxy(){
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void lease() {
        host.lease();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //签合同
    public void contract(){
        System.out.println("中介引导签合同");
    }
    //收中介费
    public void fare(){
        System.out.println("中介收中介费");
    }
}
