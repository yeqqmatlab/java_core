package com.yqq.type;

import java.util.ArrayList;
import java.util.List;

/**
 * created by yqq 2020/3/27
 */
public class Test {

    public static void main(String[] args) {
        //compile error
        //List<Fruit> vo = new ArrayList<>(Apple);

        List<? extends Fruit> vo = new ArrayList<Apple>();



    }

}

class Fruit{}

class Apple extends Fruit{}

class Jonathan extends Apple{}

class Orange extends Fruit{}
