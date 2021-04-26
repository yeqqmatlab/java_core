package com.yqq.thread.ch01.returnInterrupt;

public class MyThread extends Thread{

    @Override
    public void run() {

        while (true) {
            if (this.isInterrupted()) {
                System.out.println("stopped...");
                return;
            }
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        }
    }

}
