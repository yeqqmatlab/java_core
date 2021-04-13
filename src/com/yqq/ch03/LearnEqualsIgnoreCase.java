package com.yqq.ch03;

public class LearnEqualsIgnoreCase {

    public static void main(String[] args) {
        if ("Hello".equalsIgnoreCase("hello")) {
            System.out.println("true");
        }

        StringBuffer hello = new StringBuffer("Hello");
        System.out.println("Hello".equals(hello)); //false
        System.out.println("Hello".contentEquals(hello)); //true
        System.out.println("Hello".contentEquals(hello)); //true
//        @www.java1234.com

    }
}
