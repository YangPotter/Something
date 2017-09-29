/**
 * Count average num, Structured
 */
package com.SoftEngin;

import java.util.Scanner;

public class Test1_1_Structured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Set array:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        countAve(array, n);
    }

    static void countAve(int[] array, int n) {
        System.out.println("Count average num:");
        int box = 0;
        for (int i = 0; i < n; i++) {
            box += array[i];
        }
        double ave = 0;
        if (n != 0) {
            ave = (double)box / n;
        } else {
            ave = 0;
        }
        System.out.println("Average = " + ave);
    }
}
