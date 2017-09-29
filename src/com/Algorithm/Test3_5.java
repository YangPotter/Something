package com.Algorithm;

import java.util.Scanner;

public class Test3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("物品数量为：");
        int num = 4;
//        System.out.println("背包的容量为：");
        int cap = 5;
        int[] w = {0, 2, 1, 3, 2};
        int[] v = {0, 12, 10, 20, 15};

        /*for (int i = 1; i <= num; i++) {
            System.out.println("第" + i + "物品的重量为：");
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }*/

        int[][] p = new int[num+1][cap+1];
        Package01 p1 = new Package01(w, v, p, cap, num);
        p1.knapsack();
    }
}
class Package01{
    int[] w; int[] v;
    int[][] p;
    int c, n;

    public Package01(int[] w, int[] v, int[][] p, int c, int n) {
        this.w = w; this.v = v;
        this.p = p; this.c = c;
        this.n = n;
    }

    void knapsack() {
        //计算递推边界
        int jMax = Math.min(w[n] - 1, c);    //分界点
        for (int i = 0; i < jMax; i++) {
            p[n][i] = 0;
        }
        for (int i = w[n]; i <= c; i++) {
            p[n][i] = v[n];
        }
        for (int i = n-1; i > 1; i--) {              //计算递推式
            jMax = Math.min(w[i] - 1, c);
            for (int j = 0; j <= jMax; j++) {
                p[i][j] = p[i+1][j];
            }
            for (int j = w[i]; j <= c; j++) {
                p[i][j] = Math.max(p[i+1][j], p[i+1][j - w[i]] + v[i]);
            }
            //计算最优值
            p[1][c] = p[2][c];
            if (c >= w[1]) {
                p[1][c] = Math.max(p[1][c], p[2][c - w[1]] + v[1]);
            }
            System.out.println(p[1][5]);
        }
    }
}