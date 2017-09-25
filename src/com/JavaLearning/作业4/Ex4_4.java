package com.JavaLearning;

public class Ex4_4 {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 1);
        Complex complex2 = new Complex(2, 2);
        complex1.sub(complex1, complex2).getComplex();
    }
}
class Complex{
    private int real;
    private int ima;

    public Complex(int real, int ima) {
        this.real = real;
        this.ima = ima;
    }

    public Complex() {
        real = 0;
        ima = 0;
    }

    public Complex add(Complex x1, Complex x2) {
        x1.real = x1.real + x2.real;
        x1.ima = x1.ima + x2.ima;
        return new Complex(x1.real, x1.ima);
    }
    public Complex sub(Complex x1, Complex x2) {
        x1.real = x1.real - x2.real;
        x1.ima = x1.ima - x2.ima;
        return new Complex(x1.real, x1.ima);
    }
    public Complex mul(Complex x1, Complex x2) {
        x1.real = x1.real * x2.real - x1.ima * x2.ima;
        x1.ima = x1.real * x2.ima + x1.ima * x2.real;
        return new Complex(x1.real, x1.ima);
    }
    public Complex div(Complex x1, Complex x2) throws Exception {
        if (x2.real == 0 && x2.ima == 0) {
            throw new Exception("不能为0！");
        }
        x1.real = (x1.real * x2.real + x1.ima * x2.ima) / (x2.real * x2.real + x2.ima * x2.ima);
        x1.ima = x1.ima * x2.real - x1.real * x2.ima / (x2.real * x2.real + x2.ima * x2.ima);
        return new Complex(x1.real, x1.ima);
    }

    public void getComplex() {
        if (real != 0) {
            if (ima < 0) {
                System.out.println(real +" " + ima + "i");
            } else if (ima == 0) {
                System.out.println(real);
            } else {
                System.out.println(real + "+" + ima + "i");
            }
        } else {
            if (ima != 0) {
                System.out.println(ima + "i");
            } else {
                System.out.println(real);
            }
        }


    }
}