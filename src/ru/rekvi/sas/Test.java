package ru.rekvi.sas;

class Test {
    public static void main(String[] args) {
        System.out.println(fractional(1.53));
        System.out.println(fractional(0.0));
        System.out.println(fractional(1.0));
        System.out.println(fractional(98.45));
    }
    static double fractional(double num){

        return (num % 1);
    }
}

