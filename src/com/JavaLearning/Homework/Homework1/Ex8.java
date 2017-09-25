package com.JavaLearning;

public class Ex8 {
    public static void main(String[] args) {
        Narcissus narcissus = new Narcissus();
        for (int i = 100; i < 1000; i++) {
            if (narcissus.isNar(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
class Narcissus {
    public boolean isNar(int n) {
        String ns = String.valueOf(n);
        char[] nc = ns.toCharArray();
        int box = 0;
        for (int i = 0; i < nc.length; i++) {
            int x = Integer.parseInt(String.valueOf(nc[i]));
            box += Math.pow(x, 3);
        }
        if (n == box) {
            return true;
        } else {
            return false;
        }
    }
}