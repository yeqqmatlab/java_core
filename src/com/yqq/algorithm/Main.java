package com.yqq.algorithm;

import java.math.BigInteger;

/**
 * description:
 * Created by yqq
 * 2021-10-08
 */
public class Main {
    public static void main(String[] args) {

        f();

    }


    public static void f(){
        boolean flag = "1111qq".matches("[0-9]+");
        System.out.println("flag = " + flag);

        //Object a = 13644625550092330522L;

        String s = new BigInteger("13644625550092330522").toString(32);
        System.out.println("s = " + s);

        String s2 = new BigInteger("9999999999").toString(32);
        System.out.println("s2 = " + s2);
    }

}
