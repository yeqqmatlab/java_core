package com.yqq.thread.ch01.nosharedData;

public class MyThread extends Thread{

    private int count = 5;

    public MyThread(String name) {
      super();
      this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName()+"计算"+"count="+count);

        }
    }
}
