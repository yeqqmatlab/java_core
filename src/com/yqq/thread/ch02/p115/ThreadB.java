package com.yqq.thread.ch02.p115;


public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
