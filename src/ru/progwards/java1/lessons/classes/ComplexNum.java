package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;
    int c, d;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String toString() {
       // return a+"+"+b+"i";
        if (b >= 0)
            return  a+"+"+b+"i";
        else
            return a+"-"+ -b+"i";
    }

    public ComplexNum add(ComplexNum num) {
        int a1 = this.a + num.a;
        int b1 = this.b + num.b;
        return num;
    }
//
//    public ComplexNum sub(ComplexNum num) {
//        (a + bi) - (c + di) = (a - c) + (b - d) i
//    }
//
//    public ComplexNum mul(ComplexNum num) {
//        (a + bi) * (c + di) = (a * c - b * d) + (b * c + a * d) i
//    }
//
//    public ComplexNum div(ComplexNum num) {
//        (a + bi) / (c + di) = (a * c + b * d) / (c * c + d * d) + ((b * c - a * d) / (c * c + d * d)) i
//    }

    public static void main(String[] args) {
        System.out.println();
    }
}