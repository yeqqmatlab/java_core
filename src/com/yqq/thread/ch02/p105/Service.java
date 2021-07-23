package com.yqq.thread.ch02.p105;

public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean flag = true;
        while (flag) {

        }
        System.out.println("methodA end");
    }

    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }


}
