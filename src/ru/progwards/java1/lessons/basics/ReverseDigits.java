package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static void main(String[] args) {

        int a = 123 / 100;
        int b = 123 / 10 % 10;
        int c = 123 % 10;

        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
    }
}
