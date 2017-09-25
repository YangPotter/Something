package com.JavaLearning;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入N:");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int previous = 1;
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= i; j++){
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
