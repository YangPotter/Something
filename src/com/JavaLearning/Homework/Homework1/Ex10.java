package com.JavaLearning;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++ ) {
            int num = 2 * i - 1;
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
