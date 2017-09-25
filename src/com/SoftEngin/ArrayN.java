package com.SoftEngin;

import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = input.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i;
        }
        Propersition p1 = new ArraySum(A, n);
        Propersition p2 = new ArrayMax(A, n);
        System.out.println("sum = " + p1.pro(n-1));
        System.out.println("max = " + p2.pro(n-1));
    }
}
interface Propersition {
    public int pro(int n);
}

class ArraySum implements Propersition {
    int[] A;
    int sum = 0;
    int n = 0;
    public ArraySum(int[] A, int n) {
        this.A = A;
        this.n = n - 1;
    }

    @Override
    public int pro(int n) {
        if (n == 0) {
            return A[n];
        }
        sum += A[n];
        pro(n-1);
        return sum;
    }
}
class ArrayMax implements Propersition {
    int[] A;
    int n = 0;
    int max = 0;
    public ArrayMax(int[] A, int n) {
        this.A = A;
        this.n = n - 1;
    }

    @Override
    public int pro(int n) {
        if (n == 0) {
            return max;
        }
        if (A[n] >= max) {
            max = A[n];
        }
        pro(n - 1);
        return max;
    }
}