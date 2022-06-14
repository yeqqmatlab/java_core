package com.yqq.ch03;


import java.util.Arrays;

/**
 * description:
 * Created by yqq
 * 2022-01-25
 */
public class MainArr {
    public static void main(String[] args) {

        int[] a = new int[] {1,1};
        int x1 = Arrays.binarySearch(a, 5);
        int x2 = Arrays.binarySearch(a, 4);
        int x3 = Arrays.binarySearch(a, 0);
        int x4 = Arrays.binarySearch(a, 10);
        System.out.println("x1:" + x1 + ", x2:" + x2);
        System.out.println("x3:" + x3 + ", x4:" + x4);

        String s = Arrays.toString(a);
        System.out.println("s = " + s);

        int hashCode = Arrays.hashCode(a);
        System.out.println("hashCode = " + hashCode);

    }
}
