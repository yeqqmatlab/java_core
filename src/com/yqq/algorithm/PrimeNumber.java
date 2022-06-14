package com.yqq.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * description: 求自然数N内的所有素数
 * Created by yqq
 * 2022-06-13
 */
public class PrimeNumber {

    private static Long N = 100000000000l;
    private static List<Long> arr = new ArrayList<>();


    public static void main(String[] args) {

        arr.add(2L);
        arr.add(3L);
        arr.add(5L);

        for (Long i = 6L; i < N; i++) {
            long k = (long)Math.sqrt(i);
            boolean isPrime = true;
            for (long j = 2; j <= k; j++) {
                if (i % j == 0) {
                    isPrime = false;//不是素数
                    break;
                }
            }
            if (isPrime) {
                arr.add(i);
            }
        }

        System.out.println("arr = " + arr);

        BigDecimal divide = BigDecimal.valueOf(N).divide(BigDecimal.valueOf(arr.size()), 3,BigDecimal.ROUND_DOWN);

        System.out.println("divide = " + divide);

        double log = Math.log(N);

        System.out.println("log = " + log);


    }
}
