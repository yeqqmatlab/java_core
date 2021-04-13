package com.yqq.hash;

/**
 * created by yqq 2020/3/16
 */
public class TestHash {

    public static void main(String[] args) {

        //int aa = bernsteinHash("aaa");

        //System.out.println("aa--->"+aa);

        //final int x = RSHash("a");
        //System.out.println("x-->"+x);

        final int k = additiveHash("z", 27);
        System.out.println("k--->"+k);


    }


    static int bernsteinHash(String key){
        int hash = 0;
        int i;
        for(i=0; i<key.length(); ++i){
            hash = 33*hash+key.charAt(i);
        }

        return hash;
    }

    static int RSHash(String str){
        int b    = 378551;
        int a    = 63689;
        int hash = 0;

        for(int i = 0; i < str.length(); i++)
        {
            hash = hash * a + str.charAt(i);
            a    = a * b;
        }
        return (hash & 0x7FFFFFFF);
    }

    /**//**
     * 加法hash
     * @param key 字符串
     * @param prime 一个质数
     * @return hash结果
     */
    public static int additiveHash(String key,int prime){

        int hash = key.length();
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
            System.out.println(key.charAt(i));
            System.out.println("hash2-->"+hash);
        }

        return (hash % prime);
    }

}
