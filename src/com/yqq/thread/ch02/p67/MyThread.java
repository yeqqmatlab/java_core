package com.yqq.thread.ch02.p67;

public class MyThread extends Thread{

    @Override
    public void run() {

        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
