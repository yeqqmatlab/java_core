package com.yqq.thread.ch02.p65;

public class Service {

    public synchronized void service1(){
        System.out.println("service1");
        service2();
    }

    public synchronized void service2() {
        System.out.println("service2");
        service3();
    }

    private synchronized void service3() {
        System.out.println("service3");
    }
}
