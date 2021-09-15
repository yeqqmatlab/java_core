package com.yqq.ch05;

/**
 * description:
 * Created by yqq
 * 2021-09-14
 */
public class Father {

    public Father(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Father() {
    }

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
