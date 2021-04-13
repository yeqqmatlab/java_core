package com.yqq.algorithm;

/**
 * 字符串查找
 * created by yqq 2020/4/10
 */
public class Solution {
    public int strStr(String source,String target){
        if(source == null || target == null ){
            return 0;
        }
        for(int i = 0; i < source.length() - target.length() + 1; i++){
            int j = 0;
            for (; j < target.length(); j++){
               if(source.charAt(i+j) != target.charAt(j)){
                   break;
               }
            }
            if(j == target.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("start...");

        Solution vo = new Solution();
        int i = vo.strStr("aaaaadcfess", "cf");
        System.out.println(i);
        System.gc();
        System.out.println("end...");
    }
}
