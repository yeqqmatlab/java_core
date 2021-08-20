package com.yqq.thread.ch03.condition;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();

        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();

        Thread.sleep(1000);
        myService.signalAll_A();

        /**
         * 体会：
         * 输出结果如下图所示，我们可以看到只有线程A被唤醒，线程B仍然阻塞。
         * 实际上，Condition 实现了一种分组机制，将所有对临界资源进行访问的线程进行分组，
         * 以便实现线程间更精细化的协作，例如通知部分线程。我们可以从上面例子的输出结果看出，
         * 只有conditionA范围内的线程A被唤醒，而conditionB范围内的线程B仍然阻塞。
         *
         */


    }
}
