package com.yqq.thread.ch02.p103;

public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print("SS");
    }
}
