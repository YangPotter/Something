package com.Algorithm;

/********集合全排列问题*******/
public class Test1_1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        Perm p = new Perm();
        p.perm(list, 1, 4);
    }
}

class Perm {
    public void perm(int[] list, int k, int m) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list[i + 1] + " ");
            }
            System.out.println();
        } else {
            for (int j = k; j <= m; j++) {
                swap(list, k, j);
                perm(list, k + 1, m);
                swap(list, k, j);
            }
        }
    }
    private void swap(int[] list, int k, int j) {
        int box = list[k];
        list[k] = list[j];
        list[j] = box;
    }
}
