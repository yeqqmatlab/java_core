package com.yqq.thread.ch02.volatileDemo;

/**
 * inc++ 非原子性
 * 多线程 线程不安全
 */
public class Test1 {

    public volatile int inc = 0;

    public void increase(){
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        final Test1 test1 = new Test1();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    test1.increase();
                }
            }).start();
        }



        /*while (Thread.activeCount() > 1) {
            System.out.println("Thread.activeCount() = " + Thread.activeCount());
            Thread.yield();
        }*/
        Thread.sleep(1000*10);

        System.out.println(test1.inc);


    }
}
