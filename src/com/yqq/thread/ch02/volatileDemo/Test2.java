package com.yqq.thread.ch02.volatileDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock
 */
public class Test2 {

    public  int inc = 0;

    Lock lock = new ReentrantLock();

    public void increase(){
        lock.lock();
        try {
            inc++;
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        final Test2 test1 = new Test2();
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
        Thread.sleep(1000*3);

        System.out.println(test1.inc);


    }
}
