package com.JavaLearning;

public class Ex6 {
    public static void main(String[] args) {
        Prime prime = new Prime();
        int flag = 0;
        for (int i = 1; i <= 200; i++) {
            if (prime.isPrime(i)) {
                System.out.print(i + " ");
                flag++;
            }
            if (flag % 5 == 0) {
                System.out.println();
            }
        }
    }
}
class Prime {

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