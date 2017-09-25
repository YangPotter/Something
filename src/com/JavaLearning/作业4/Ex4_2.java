package com.JavaLearning;

public class Ex4_2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("周长：" + rectangle.C());
        System.out.println("面积：" + rectangle.S());
    }
}
class Rectangle {
    private int length = 0;
    private int width = 0;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //周长
    public int C() {
        int c = (length + width) * 2;
        return c;
    }

    //面积
    public int S() {
        int s = length * width;
        return s;
    }
}