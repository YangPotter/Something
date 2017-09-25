package com.Algorithm;

import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.println("输入数组元素个数：");
        int arrayLength = input.nextInt();
        System.out.println("选择第k小的元素：");
        int k = input.nextInt();
        System.out.println("输入数组元素：");
        for (int i = 0; i < arrayLength; i++) {
            a[i] = input.nextInt();
        }
        Select s = new Select(a);
        System.out.println("第" + k + "小的元素为：" + s.select(0, arrayLength -1, k));
    }
}
class Select {
    private  int[] a;
    public Select(int[] a) {
        this.a = a;
    }

    public int select(int left, int right, int k) {
        if (left >= right)
            return a[left];
        int i = left;
        int j = right + 1;

        int pivot = a[left];
        while (true) {
            do {
                i = i + 1;
            } while (a[i] < pivot);
            do {
                j = j - 1;
            } while (a[j] > pivot);
            if (i >= j) break;
            swap(i, j);
        }
        if (j - left + 1 == k)
            return pivot;
        a[left] = a[j];
        a[j] = pivot;
        if (j - left + 1 < k)
            return select(j +1, right, k - j + left -1);
        else
            return select(left, j -1, k);

    }
    void swap(int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }
}
