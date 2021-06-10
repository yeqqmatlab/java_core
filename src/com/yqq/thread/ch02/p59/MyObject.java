package com.yqq.thread.ch02.p59;

public class MyObject {

    /**
     * 同步方法
     */
    public synchronized void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("end endTime"+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步方法
     */
    public synchronized void methodB(){
        try {
            System.out.println("begin methodB threadName="+Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("end endTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
