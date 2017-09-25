package com.JavaLearning.作业3;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factorial2 f2 = new Factorial2(9);
        System.out.println("结果为：" + f2.getResult());
    }
}
class Factorial2 {
    private int n;
    private int box = 1;

    public Factorial2(int n) {
        this.n = n;
    }

    public int f(int m) {
        int box = 1;
        for (int i = 1; i <= m; i++) {
            box *= i;
        }
        return box;
    }

    public double getResult() {
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            result += f(i);
        }
        return result;
    }
}