package com.JavaLearning.作业3;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入m：");
        int m = sc.nextInt();
        System.out.print("输入n：");
        int n = sc.nextInt();

        Factorial1 ex = new Factorial1(m, n);
        System.out.println("结果为：" + ex.getResult());
    }
}
class Factorial1 {
    private int m;
    private int n;
    public Factorial1(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int f(int n) {
        int box = 1;
        for (int i = 1; i <= n; i++) {
            box *= i;
        }
        return box;
    }
    public double getResult() {
        double result = f(m) / (f(n) * f(m-n));
        return result;
    }
}