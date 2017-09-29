/**
 * p=(a+b+c)/2
 * 面积的平方s^2=p*(p-a)*(p-b)*(p-c)
 * OOP
 */
package com.SoftEngin;

import java.util.Scanner;

public class Test1_2_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the side of triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("The area of triangle is: " + triangle.getArea());
    }
}

class Triangle {
    private int a;
    private int b;
    private int c;
    private double area;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void countArea() {
        double p = ( a + b + c) / 2;
        double s2 = p * (p - a) * (p - b) * (p - c);
        area = Math.sqrt(s2);
    }
    public double getArea() {
        countArea();
        return area;
    }
}