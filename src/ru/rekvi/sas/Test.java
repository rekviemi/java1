package ru.rekvi.sas;

class Test {
    public static void main(String[] args) {


    }

    public static int reverseDigits(int number) {
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;

        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
        return a + b + c;
    }

}

