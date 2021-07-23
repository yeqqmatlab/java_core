package com.yqq.thread.ch02.p103;

public class Service {
    public static void print(String stringParam){

        try{
            synchronized (stringParam){
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.println("stringParam = " + stringParam);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
