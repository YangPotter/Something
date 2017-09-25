package com.JavaLearning;

public class Ex2_4 {
    public static void main(String[] args) {
        int[] a = new int[10000];
        int[] counter = new int[10];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*10);
            switch (a[i]) {
                case 0: counter[0]++;break;
                case 1: counter[1]++;break;
                case 2: counter[2]++;break;
                case 3: counter[3]++;break;
                case 4: counter[4]++;break;
                case 5: counter[5]++;break;
                case 6: counter[6]++;break;
                case 7: counter[7]++;break;
                case 8: counter[8]++;break;
                case 9: counter[9]++;break;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "有：" + counter[i] + "个");
        }
    }
}
