package com.tl.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }
    public Proxy() {

    }

    @Override
    public void rent() {
        host.rent();
        fare();
    }
    public void fare(){
        System.out.println("收费");
    }
}
