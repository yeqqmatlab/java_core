package com.yqq.algorithm.chapter01;

/**
 * description:
 * Created by yqq
 * 2022-06-22
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target){
        int length = nums.length;
        int[] ans = new int[2];
        int i,j;
        for ( i = 0; i < length - 1; i++) {
            for ( j = i+1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
