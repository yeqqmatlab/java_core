package com.yqq.hash;

import java.util.Objects;

/**
 * created by yqq 2020/3/16
 */
public class TestHash2 {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestHash2 testHash2 = (TestHash2) o;
        return age == testHash2.age &&
                Objects.equals(name, testHash2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
