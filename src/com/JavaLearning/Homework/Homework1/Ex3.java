package com.JavaLearning;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入x1");
        int x1 = sc.nextInt();
        System.out.println("输入x2");
        int x2 = sc.nextInt();
        System.out.println("输入x3");
        int x3 = sc.nextInt();
        Sort s = new Sort(x1, x2, x3);
        s.getSort();
        s.showSort();
    }
}
class Sort {
    private int[] x = new int[3];

    public Sort(int a, int b, int c) {
        x[0] = a;
        x[1] = b;
        x[2] = c;
    }
    public void getSort() {
        for (int i = x.length -1; i > 0; i--) {
            if (x[i] < x[i-1]) {
                int box = x[i];
                x[i] = x[i-1];
                x[i-1] = box;
            }
        }
    }
    public void showSort() {
        System.out.println("由小到大的顺序为：");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
