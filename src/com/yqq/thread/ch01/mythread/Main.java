package com.yqq.thread.ch01.mythread;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int)Math.random()*1000;
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
