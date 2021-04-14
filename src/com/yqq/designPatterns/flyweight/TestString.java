package com.yqq.designPatterns.flyweight;

public class TestString {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true 均指向常量池中对象
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false  两个引用指向堆中的不同对象
        System.out.println(s3.intern() == s1); //true
        System.out.println(s3.intern() == s4.intern()); //true

        System.out.println("---------------------------------------------------------->");

        String str1 = new StringBuilder("计算机").append("软件").toString();

        String str2 = new StringBuilder("ja").append("va").toString();

        String str3 = "java";
        String str4 = new String("java");

        System.out.println(str1.intern() == str1);// true 因为之前没有所以创建的引用和intern()返回的引用相同

        System.out.println(str2.intern() == str3);// true

        System.out.println(str2.intern() == str2);//"java在StringBuilder()之前已经出现过",所以intern()返回的引用与新创建的引用不是同一个

        System.out.println(str3 == str4);



    }
}
