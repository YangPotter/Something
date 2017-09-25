package com.JavaLearning;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入a：");
        int a = sc.nextInt();
        System.out.println("输入b：");
        int b = sc.nextInt();
        System.out.println("输入c：");
        int c = sc.nextInt();
        CountX countX = new CountX(a, b, c);
        countX.getX();
        countX.showX();
    }

}
class CountX {
    private int a;
    private int b;
    private int c;
    double x1 = 0;
    double x2 = 0;
    int D = 0;
    public CountX(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getX() {
        D = b * b - 4 * a * c;
        double d = Math.sqrt(D);
        if (D > 0) {
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
        } else if (D == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = x2 = 0;
        }
    }
    public void showX() {
        if (D > 0) {
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            System.out.println("x1 = x2 = " + x1);
        }else {
            System.out.println("无实根！");
        }
    }
}
