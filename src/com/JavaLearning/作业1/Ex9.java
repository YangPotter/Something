package com.JavaLearning;

public class Ex9 {
    public static void main(String[] args) {
        FullNum fullNum = new FullNum();
        for (int i = 1; i < 2000; i++) {
            if (fullNum.isFullNum(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
class FullNum {

    public boolean isFullNum(int n) {
        int box = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                box += i;
            }
        }
        if (box == n) {
            return true;
        }else {
            return false;
        }
    }
}