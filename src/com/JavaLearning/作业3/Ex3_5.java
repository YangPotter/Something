package com.JavaLearning.作业3;

public class Ex3_5 {
    public static void main(String[] args) {
        Factorial3 f3 = new Factorial3();
        System.out.println("5的阶乘为：" + f3.f(5));
        f3.getResult();
        System.out.println("6的阶乘为：" + f3.f(6));
        f3.getResult();
        System.out.println("8的阶乘为：" + f3.f(8));
        f3.getResult();
    }
}
class Factorial3 {
    int box = 1;

    public int f(int n) {
        if (n == 1)
            return 1;
        box *= n * f(n-1);
        return box;
    }
    
    public double getResult() {
        box = 1;
        return 0;
    }
}