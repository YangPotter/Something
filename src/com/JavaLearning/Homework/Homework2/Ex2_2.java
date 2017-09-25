package com.JavaLearning;

public class Ex2_2 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println("这十个数为");
        for(int i:a){
            System.out.print(i + " ");
        }
        int max=a[0];
        System.out.println("他们的最大值为"+max);
    }
}
