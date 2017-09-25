/*
 * 素数判定
 */
package com.SoftEngin;

public class JudgeTool {
    public static void main(String[] args) {
        JudgePrime tool = new JudgePrime();
        System.out.println(tool.isPrime(2));
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