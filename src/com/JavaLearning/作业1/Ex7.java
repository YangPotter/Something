package com.JavaLearning;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("精确程度（例：10000）：");
        int k = sc.nextInt();
        Pi pi = new Pi(k);
        System.out.println(pi.getPi());
    }
}
class Pi {
    private int k;
    private double j = 1.0;
    private double pi;

    public Pi(int k) {
        this.k = k;
    }

    public double getPi() {
        for (int i = 1; i <= k; i++) {
            pi += 1 / j * Math.pow((-1.0), i+1) ;
            j += 2;
        }
        pi = pi * 4;
        return pi;
    }
}