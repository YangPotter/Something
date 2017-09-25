/*
 * 动态规划，矩阵连乘积问题
 */
package com.Algorithm;

import java.util.Scanner;

public class Test3_1 {
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
        MatrixChain mat = new MatrixChain(n, p, m, s);
        mat.matrixChain();
        mat.showMin();
    }
}
class MatrixChain {
    private int n;
    private int[] p;
    private int[][] m;
    private int[][] s;

    public MatrixChain(int n, int[] p, int[][] m, int[][] s) {
        this.n = n;
        this.p = p;
        this.m = m;
        this.s = s;
    }
    public void matrixChain() {
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;    //第一条对角线；
        }
        for (int r = 2; r <= n; r++) {
            for (int i = 1; i <= n-r+1; i++) {
                int j = i + r - 1;    // i 断点位置；
                m[i][j] = m[i + 1][j] + p[i - 1] * p[i] * p[j];
                s[i][j] = i;    // s 数组记录断点位置；
                for (int k = i + 1; k < j; k++) {
                    int t = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
                    if (t < m[i][j]) {
                        m[i][j] = t;
                        s[i][j] = k;
                    }
                }
            }
        }
    }
    public void showMin() {
        System.out.print(m[1][n]);
    }
}