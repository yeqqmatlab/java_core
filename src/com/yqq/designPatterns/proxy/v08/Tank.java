package com.yqq.designPatterns.proxy.v08;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 *
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * 分离代理行为与被代理对象
 *
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(1000*1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Tank tank = new Tank();

        // reflect  通过二进制字节码分析类的属性和方法
        Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader()
                , new Class[]{Movable.class}
                , new LogHandler(tank));

        m.move();

    }
}

class LogHandler implements InvocationHandler{

    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method: " + method.getName() + "start...");
        Object invokeObj = method.invoke(tank, args);
        System.out.println("method: " + method.getName() + "end...");
        return invokeObj;
    }
}

interface Movable{
    void move();
}
