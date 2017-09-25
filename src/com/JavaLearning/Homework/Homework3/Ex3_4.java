package com.JavaLearning.作业3;

public class Ex3_4 {
    public static void main(String[] args) {
        Prime2 p2 = new Prime2();
        p2.getResult();
    }
}
class Prime2 {
    int counter = 0;

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
        for (int i = 800; i < 1000; i++) {
            if (f(i) == 1.0) {
                System.out.println(i);
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        return 0;
    }
}