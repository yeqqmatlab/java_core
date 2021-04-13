package com.yqq.designPatterns.strategy.comparator;

import com.yqq.designPatterns.strategy.comparable.Cat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};

        Sorter2<Cat> sorter = new Sorter2<>();
        //不同的比较策略传入不同比较器
        sorter.sort(a,new CatHeightComparator());

        System.out.println(Arrays.toString(a));


    }

}
