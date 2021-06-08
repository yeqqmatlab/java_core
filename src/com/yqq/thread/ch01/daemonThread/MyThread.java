package com.yqq.thread.ch01.daemonThread;

public class MyThread extends Thread{

    private int i = 0;

    @Override
    public void run() {

        try {
            while (true) {
                i++;
                System.out.printf("i="+i);
                Thread.sleep(10000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
