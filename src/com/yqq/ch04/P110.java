package com.yqq.ch04;

import java.util.Date;

/**
 * description:
 * Created by yqq
 * 2021-08-20
 */
public class P110 {
    public static void main(String[] args) {

        Employee harry = new Employee("tom", 2000f, new Date());

        Date d = harry.getHireDay();
        double s = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long)s);

        System.out.println("d = " + d);


    }

}
