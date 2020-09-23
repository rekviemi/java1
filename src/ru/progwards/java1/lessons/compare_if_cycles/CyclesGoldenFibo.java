package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static void main(String[] args) {
        System.out.println(fiboNumber(9));
        System.out.println(containsDigit(12345, 1));
    }

     public static boolean containsDigit(int number, int digit){
         boolean is = number % 1  == digit || number  >= digit ;
         return is;
     }
    public static int fiboNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fiboNumber(n - 1) + fiboNumber(n - 2);
        }
    }
     public static boolean isGoldenTriangle(int a, int b, int c){
        boolean is = a == b;
        return is;
     }

}