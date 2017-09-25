package com.JavaLearning.作业3;

public class Ex3_3 {
    public static void main(String[] args) {
        Prime1 p1 = new Prime1();
        p1.getResult();

    }
}
class Prime1 {

    private int f(int n) {
        if (n == 1 || n== 2)
            return 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public double getResult() {
        for (int i = 100; i < 200; i++) {
            if (f(i) == 1.0) {
                System.out.println(i);
            }
        }
        return 0;
    }
}