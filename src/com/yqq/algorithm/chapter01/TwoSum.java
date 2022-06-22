package com.yqq.algorithm.chapter01;

/**
 * description: 两数之和
 * Created by yqq
 * 2022-06-22
 */
public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 13;

        Solution1 solution = new Solution1();
        int[] res = solution.twoSum(nums, 9);
        System.out.println("res0 = " + res[0] );
        System.out.println("res1 = " + res[1] );
    }

}


