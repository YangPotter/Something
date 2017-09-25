/*
 * 计算1到100的累加和
 */
package com.SoftEngin;

public class GetSum {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.method5(100));
    }
}
class Method {
    public void method1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public void method2(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    public void method3(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
    public void method4(int n) {
        int sum = (1 + n) * n / 2;
        System.out.println(sum);
    }
    int sumM5 = 0;
    public int method5(int n) {
        if (n == 1) return n;
        sumM5 = n + method5(n - 1);
        return sumM5;
    }
}