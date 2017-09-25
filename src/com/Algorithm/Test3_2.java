/*
 *矩阵连乘积问题，递归算法；
 */
package com.Algorithm;

import java.util.Scanner;

public class Test3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int n = 6;
        int[] p = new int[num];
        System.out.println("为数组p赋值：");
        for (int i = 0; i <= n; i++) {
            p[i] = input.nextInt();
        }
        int[][] m = new int[num][num];
        int[][] s = new int[num][num];
        Recurve rec = new Recurve(p, m, s);
        System.out.println(rec.recurve(1, 6));
    }
}
class Recurve {
    private int[] p;
    private int[][] m;
    private int[][] s;

    public Recurve(int[] p, int[][] m, int[][] s) {
        this.p = p;
        this.m = m;
        this.s = s;
    }
    public int recurve(int i, int j) {
        if (m[i][j] > 0) {
            return m[i][j];
        }
        if (i == j) {
            return 0;
        }
        int u = recurve(i, i) + recurve(i + 1, j) + p[i-1] * p[i] * p[j];
        s[i][j] = i;
        for (int k = i + 1; k < j; k++) {
            int t = recurve(i, k) + recurve(k+1, j) + p[i-1] * p[k] * p[j];
            if (i < u) {
                u = t;
                s[i][j] = k;
            }
        }
        m[i][j] = u;
        return u;
    }
}
