package com.yqq.pojo;

import com.yqq.annotation.FruitColor;
import com.yqq.annotation.FruitName;

/**
 * created by yqq 2020/3/27
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("---->"+apple.getAppleName());



    }
}
