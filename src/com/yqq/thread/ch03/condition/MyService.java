package com.yqq.thread.ch03.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  Condition:状态
 *
 *  Condition中的await()对应Object的wait()；
 *  Condition中的signal()对应Object的notify()；
 *  Condition中的signalAll()对应Object的notifyAll()。
 *
 *  必须要注意的是: Condition 的 await()/signal() 使用都必须在lock保护之内，也就是说，必须在lock.lock()和lock.unlock之间才可以使用。
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition conditionA = lock.newCondition();

    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        lock.lock();
        try {
            System.out.println("begin awaitA时间为" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());

            conditionA.await();

            System.out.println("  end awaitA时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void awaitB(){
        lock.lock();
        try {
            System.out.println("begin awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());

            conditionB.await();

            System.out.println("  end awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println(" signalAll_A时间为 " + System.currentTimeMillis() + " ThreadName= " + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println(" signalAll_B时间为 " + System.currentTimeMillis() + " ThreadName= " + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }






}
