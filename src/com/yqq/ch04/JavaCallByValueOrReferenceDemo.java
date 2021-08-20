package com.yqq.ch04;

import java.util.Date;

/**
 * description:
 * Created by yqq
 * 2021-08-20
 */
public class JavaCallByValueOrReferenceDemo {

    public static void main(String[] args) {

        Employee ex = new Employee("ex",20f, new Date());
        Employee ey = new Employee("ey",30f, new Date());
        System.out.println("ex = " + ex);
        System.out.println("ey = " + ey);
        System.out.println("-------------------------------------------------------->");
        /**
         * 如果传递的是引用则ex,ey的对象应该互换，而ex,ey没有互换
         * swap方法的参数被初始化为两个对象的引用拷贝，这个方法交换的是这两个拷贝
         */
        swap(ex,ey);
        System.out.println("ex = " + ex);
        System.out.println("ey = " + ey);


    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("-------------------------------------------------------->");
    }

}
