package com.yqq.thread.ch01.priority10;

import java.util.Random;

public class MyThread2 extends Thread{



    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long addRes = 0;
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 50000; i++){
                //Random random = new Random();
                //int i1 = random.nextInt();
                addRes = addRes + i;

            }

        }
        long end = System.currentTimeMillis();
        System.out.println("\"thread 2 use time = \" + (end - start) = " + "thread 2 use time = " + (end - start));




    }
}
