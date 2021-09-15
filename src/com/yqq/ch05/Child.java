package com.yqq.ch05;

/**
 * description: super关键字有两个用途：一个是调用超累方法，二是调用类的构造器
 * Created by yqq
 * 2021-09-14
 */
public class Child extends Father {

    public Child(double salary) {
        super();
        this.salary = salary;
    }

    public Child(int age, String name, double salary) {
        //super调用构造器的语句必须是子类构造器的第一条语句。
        super(age, name);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //实例调用方法
        super.getAge();
        this.salary = salary;
    }

    public static void main(String[] args) {
        Father father = new Father();
        // 没有father(10,"tom") 这样的写法
        father.getAge();
    }
}
