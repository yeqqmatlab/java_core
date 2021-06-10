package com.yqq.thread.ch02.p65;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
