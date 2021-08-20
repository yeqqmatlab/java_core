package com.yqq.thread.ch02.volatileDemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * java 并发包中的原子操作
 */
public class Test3 {

    public AtomicInteger inc = new AtomicInteger();

    public void increase(){
        inc.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        final Test3 test1 = new Test3();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    test1.increase();
                }
            }).start();
        }

        Thread.sleep(1000*3);

        System.out.println(test1.inc);
    }
}
