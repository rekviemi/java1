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

    public ComplexNum sub(ComplexNum num) {
        int a1 = this.a - num.a;
        int b1 = this.b - num.b;
        return num;
    }

    public ComplexNum mul(ComplexNum num) {
        int a1 = this.a * num.a;
        int b1 = this.b * num.b;
        return num;
    }

    public ComplexNum div(ComplexNum num) {
        int a1 = this.a / num.a;
        int b1 = this.b / num.b;
        return num;
    }

    public static void main(String[] args) {

    }
}