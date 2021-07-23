package com.yqq.thread.ch02.p103;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();


    }
}
