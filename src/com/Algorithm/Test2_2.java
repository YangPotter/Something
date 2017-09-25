package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.println("样例个数：");
        int n = input.nextInt();
        System.out.println("输入油田坐标：");
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            a[i] = input.nextInt();
        }

        SortFun sf = new SortFun(a, n);
        sf.minLength1();

        MidNumFun mn = new MidNumFun(a, n);
        mn.minLength2();

    }
}


class SortFun {
    private int[] a;
    private int n;
    public SortFun(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public void minLength1() {
        Arrays.sort(a, 0, n-1);
        int min = 0;
        for(int i = 0; i < n; i++) {
            min += (int)Math.abs(a[i] - a[n / 2]);
        }
        System.out.println("输油管最小长度总和为：" + min);
    }
}

class MidNumFun {
    private int[] a;
    private int n;

    public MidNumFun(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public void minLength2() {
        int min = 0;
        Select s = new Select(a);
        int y = s.select(0, n-1, n / 2);

        for (int i = 0; i < n; i++) {
            min += (int)Math.abs(a[i] - y);
        }
        System.out.println("输油管最小长度总和为：" + min);
    }
}