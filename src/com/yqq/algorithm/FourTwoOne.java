package com.yqq.algorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 从概率的角度解释考拉兹猜想
 * ch2函数密度为2/3
 * ch3函数密度为1/3
 * create by yqq
 * code for 考拉兹猜想
 */
public class FourTwoOne {

    private static List<Long> arr = new ArrayList<>();
    private static List<Integer> distributeArr = new ArrayList<>();
    private static long ch2 = 0;
    private static long ch3 = 0;

    public static void main(String[] args) throws IOException {
        long n = 9L;
        chang(n);
    }

    private static void chang3(long k) {
        long i = k * 3 + 1;
        ch3++;
        distributeArr.add(3);
        chang(i);
    }

    private static void chang2(long k) {
        long i = k / 2;
        ch2++;
        distributeArr.add(2);
        if (i == 2) {
            System.out.println("i = " + i);
            //arr.add(i);
            System.out.println("arr = " + arr);
            System.out.println("arr_size = " + arr.size());
            System.out.println("distributeArr = " + distributeArr);
            System.out.println("distributeArr_size = " + distributeArr.size());

            System.out.println("ch2 = " + ch2);
            System.out.println("ch3 = " + ch3);
            System.out.println("p_ch2 = " + (float) ch2 /distributeArr.size());
            System.out.println("p_ch3 = " + (float) ch3 /distributeArr.size());
            float ch2_divide_ch3 = (float) ch2 / (float) ch3;
            System.out.println("ch2_divide_ch3 = " + ch2_divide_ch3);
            double v = Math.log10(3) / Math.log10(2);
            System.out.println("v = " + v);
            System.out.println("ch2_divide_ch3 > v 故数列必收敛");
            System.exit(1);
        }
        chang(i);
    }
    private static void chang(long m){
        arr.add(m);
        if (m % 2 == 0) {
            // 偶变换
            chang2(m);
        }else {
            // 奇变换
            chang3(m);
        }
    }

}
