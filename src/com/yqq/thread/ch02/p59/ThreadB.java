package com.yqq.thread.ch02.p59;

public class ThreadB extends Thread{

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
