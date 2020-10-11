package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;


    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String toString() {
        return a+"+"+b+"i";
//        if (b >= 0)
//            return  a+"+"+b+"i";
//        else
//            return a+"-"+ -b+"i";
    }

    public ComplexNum add(ComplexNum num) {
        a = this.a + num.a;
        b = this.b + num.b;

        return new ComplexNum(a, b);
    }

    public ComplexNum sub(ComplexNum num) {
        a = this.a - num.a;
        b = this.b - num.b;
        return new ComplexNum(a, b);
    }

    public ComplexNum mul(ComplexNum num) {
        a = this.a * num.a;
        b = this.b * num.b;
        return new ComplexNum(a, b);
    }

    public ComplexNum div(ComplexNum num) {
        a = this.a / num.a;
        b = this.b / num.b;
        return new ComplexNum(a, b);
    }

    public static void main(String[] args) {
        System.out.println( new ComplexNum(1, 1).add(new ComplexNum(99, 99)).toString());
        System.out.println( new ComplexNum(1, 1).sub(new ComplexNum(99, 99)).toString());
    }
}