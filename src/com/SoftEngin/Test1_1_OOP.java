/**
 * Count average num, OOP
 */
package com.SoftEngin;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1_1_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of Array: ");
        int n = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        AveCounter ave = new AveCounter(array, n);
        ave.countAve();

        System.out.println("Average = " + ave.getAve());

    }
}
class AveCounter {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> array;
    private int n;
    private int box;
    private double ave;

    public AveCounter(ArrayList<Integer> array, int n) {
        this.array = array;
        this.n = n;
    }

    public void countAve() {
        for (int i = 0; i < n; i++) {
            System.out.println("Add num: ");
            array.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            box += array.get(i);
        }
        if (box != 0) {
            ave = (double)box / n;
        }
    }

    public double getAve() {
        return ave;
    }
}