package com.yqq.thread.ch03.condition;

public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
