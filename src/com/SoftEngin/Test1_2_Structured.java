/**
 * p=(a+b+c)/2
 * 面积的平方s^2=p*(p-a)*(p-b)*(p-c)
 * Structured
 */
package com.SoftEngin;

import java.util.Scanner;

public class Test1_2_Structured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Set triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("The area of triangle: " + countArea(a, b, c));
    }

    static double countArea(int a, int b, int c) {
        double p = (double)(a + b + c) / 2;
        double s2 = p * ( p - a) * (p - b) * (p - c);
        return Math.sqrt(s2);
    }
}
