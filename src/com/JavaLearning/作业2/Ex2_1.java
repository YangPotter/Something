package com.JavaLearning;

import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入前？项");
        int n = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci.F(i) + " ");
        }

    }
}
class Fibonacci {
    public int F(int n) {
        if (n == 1)
            return 0;
        if (n == 2 || n == 3)
            return 1;
        if (n > 3)
            return F(n-1) + F(n-2);
        return F(n);
    }
}
