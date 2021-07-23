package com.yqq.thread.ch02.p97;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        /**
         * 方法 printC()是异步运行的
         */
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();


    }
}
