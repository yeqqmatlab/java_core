package com.yqq.designPatterns.strategy.comparable;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        Cat[] a = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};

        Sorter1.sort(a);

        System.out.println(Arrays.toString(a));

        Dog[] d = {new Dog(3), new Dog(5),new Dog(1)};

        Sorter1.sort(d);

        System.out.println(Arrays.toString(d));


    }
}
