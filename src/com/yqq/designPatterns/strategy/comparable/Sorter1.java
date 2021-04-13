package com.yqq.designPatterns.strategy.comparable;

public class Sorter1 {

    //冒泡排序
    public static void sort(Comparable[] arr){
        for (int i=0; i < arr.length-1; i++){
            int minPos = i;

            for(int j = i+1; j < arr.length; j++){
                //交换下标位置
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }

    }

    //交换元素位置
    private static void swap(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
