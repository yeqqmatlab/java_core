package com.yqq.ch05;

/**
 * description:
 * Created by yqq
 * 2021-09-14
 */
public class Main {
    public static void main(String[] args) {
        Manager boss = new Manager();
        Employee[] staff = new Employee[3];
        staff[0] = boss;

        boss.setBonus(10000d);
        //error
        //staff[0].setBonus(10000d);




    }
}
