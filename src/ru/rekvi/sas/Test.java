package ru.rekvi.sas;

public class Test {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(123));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;
        return (c * 100) + (b * 10) + a;
    }
}

