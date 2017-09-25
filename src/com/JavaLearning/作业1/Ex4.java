package com.JavaLearning;

public class Ex4 {
    public static void main(String[] args) {
        Judge judge = new Judge();
        System.out.println(judge.S());
    }
}
class Judge {
    private int s = 1;
    private int n = 1;
    private int N = 0;
    public int S() {
        s *= n;
        if (s > 40000) {
            return --n;
        }
        n++;
        N = S();
        return N;
    }
}