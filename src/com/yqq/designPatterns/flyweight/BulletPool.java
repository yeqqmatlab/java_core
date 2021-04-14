package com.yqq.designPatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 享元设计模式:运用共享技术来有效支持大量细粒度的对象
 */
public class BulletPool {

    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (bullets.size() > 0) {
                bullets.remove(b);
                b.living = true;
                return b;
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();
        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }

}

class Bullet{
    public UUID id = UUID.randomUUID();
    boolean living = false;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}
