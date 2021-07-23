package com.yqq.thread.ch02.p97;

public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
