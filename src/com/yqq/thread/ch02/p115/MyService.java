package com.yqq.thread.ch02.p115;

public class MyService {
    private String lock = "123";
    public void testMethod(){

        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                //锁对象被改变
                lock = "234";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
