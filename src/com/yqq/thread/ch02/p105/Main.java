package com.yqq.thread.ch02.p105;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadA b = new ThreadA(service);
        b.setName("B");
        b.start();


    }


}
