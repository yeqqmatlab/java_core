package com.yqq.ch05;

import java.util.Date;

/**
 * description:
 * Created by yqq
 * 2021-09-14
 */
public class Main2 {
    public static void main(String[] args) {
        Manager[] managers = new Manager[3];
        Employee[] staffs = managers;
        staffs[0] = new Employee("tom",1000f,new Date());

        //managers[0].setBonus(1200d);

        System.out.println("staffs[0] = " + staffs[0]);


    }
}
