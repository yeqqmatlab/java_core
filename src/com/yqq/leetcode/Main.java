package com.yqq.leetcode;

/**
 * description: 寻找峰值
 * Created by yqq
 * 2021-09-15
 */
public class Main {

    public int findPeakElement(int[] nums){
        int index = 0;
        for(int i = 0; i <= nums.length - 2; i++){
            if(nums[i+1] > nums[i] && nums[i+1] > nums[i+2]){
                index = i+1;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 1};
        Main obj = new Main();
        int index = obj.findPeakElement(arr);
        System.out.println("index = " + index);


    }



}
