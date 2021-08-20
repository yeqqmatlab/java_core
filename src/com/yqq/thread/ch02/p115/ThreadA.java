package com.yqq.thread.ch02.p115;


public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
