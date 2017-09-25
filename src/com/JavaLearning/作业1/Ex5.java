package com.JavaLearning;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数n：");
        int n = sc.nextInt();
        JudgePrime judgePrime = new JudgePrime();
        if (judgePrime.isPrime(n)) {
            System.out.println(n + "是素数");
        }else {
            System.out.println(n + "不是素数");
        }

    }
}
class JudgePrime {

    boolean isPrime(int n) {
        if (n == 1 || n== 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}