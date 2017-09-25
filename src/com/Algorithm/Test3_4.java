/*
 *最大子段和
 */
package com.Algorithm;

import java.util.Scanner;

public class Test3_4 {
    public static void main(String[] args) {
        Quote q = new Quote();
        MaxSubSum maxSubSum = new MaxSubSum();
        System.out.println(maxSubSum.MaxSum(8, q));
    }
}
class Quote {
    public int besti = 0;
    public int bestj = 0;
}
class MaxSubSum {
    private int[] a = new int[100];

    public int MaxSum(int n, Quote q) {
        int sum = 0;
        int b = 0;
        int begin = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 1; i <= n; i++) {
            if (b > 0) {
                b += a[i];
            } else {
                b = a[i];
                begin = i;
            }
            if (b > sum) {
                sum = b;
                q.besti = begin;
                q.bestj = i;
            }
        }
        return sum;
    }
}