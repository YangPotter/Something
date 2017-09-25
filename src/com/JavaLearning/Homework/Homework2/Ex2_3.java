package com.JavaLearning;

public class Ex2_3 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println("这十个数为");
        for(int i:a){
            System.out.print(i + " ");
        }
        ArraySort arraySort = new ArraySort(a);
        arraySort.sort();
    }
}
class ArraySort {
    private int[] a;

    public ArraySort(int[] a) {
        this.a = a;
    }

    public void sort() {
        for (int i = a.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int box = a[j];
                    a[j] = a[j+1];
                    a[j+1] = box;
                }
            }

        }
        System.out.println();
        System.out.println("由小到大排序：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}