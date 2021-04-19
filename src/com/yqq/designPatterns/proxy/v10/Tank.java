package com.yqq.designPatterns.proxy.v10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Tank tank = new Tank();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader()
                , new Class[]{Movable.class}
                , new TimeProxy(tank));
        m.move();


    }


}

class TimeProxy implements InvocationHandler{

    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invokeObj = method.invoke(m, args);
        after();
        return invokeObj;
    }
}

interface Movable{
    void move();
}
