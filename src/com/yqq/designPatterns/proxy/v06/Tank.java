package com.yqq.designPatterns.proxy.v06;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 *
 * 使用代理
 * 问题：如何实现代理的各种组合
 *
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("tank moving ... ");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank t = new Tank();
        new TankTimeProxy(t).move();
        new TankLogProxy(t).move();
    }
}

class TankTimeProxy implements Movable{
    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("end - start = " + (end - start));
    }
}

class TankLogProxy implements Movable{

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    Tank tank;
    @Override
    public void move() {
        System.out.println("tank start moving ... ");
        tank.move();
        System.out.println(" stop ...");
    }
}

interface Movable{
    void move();
}
