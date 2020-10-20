package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;


    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String toString() {
        return a + "+" + b + "i";
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

    public ComplexNum mul(ComplexNum num) { //-97+296i
        a = this.a * num.a;
        b = this.b * num.b;
        return new ComplexNum(a, b);
//        int AnsI = (this.a * num.b) + (this.b * num.a);
//        int AnsR = (this.a * num.a) - (this.b * num.b);
//        ComplexNum Sum = new ComplexNum(AnsR, AnsI);
//        return Sum;
    }

    public ComplexNum div(ComplexNum num) {
//        a = this.a / num.a;
//        b = this.b / num.b;
//        return new ComplexNum(a, b);
        ComplexNum ComCon = new ComplexNum(num.a, (num.b * -1));
        ComplexNum part1 = new ComplexNum(this.a, this.b).mul(ComCon);
        ComplexNum part2 = num.mul(ComCon);
        return part1;
    }

    public static void main(String[] args) {
        System.out.println(new ComplexNum(1, 1).add(new ComplexNum(99, 99)).toString());
        System.out.println(new ComplexNum(1, 1).sub(new ComplexNum(99, 99)).toString());
        System.out.println(new ComplexNum(1, 2).mul(new ComplexNum(99, 98)).toString());
        System.out.println(new ComplexNum(1000, 1000).div(new ComplexNum(100, 100)).toString());
    }
}