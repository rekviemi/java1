package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(containsDigit(0, 0));//0 фолс 1 тру === нули тру
        System.out.println(isGoldenTriangle(34, 55,55));
    }

     public static boolean containsDigit(int number, int digit) {
      boolean is = number  == digit  ;

         while (number > 0) {
             if (number % 10 == digit)
                 return true;
             number = number / 10;
         }
         return is;
     }


         public static int fiboNumber ( int n){
             if (n == 0) {
                 return 0;
             } else if (n == 1) {
                 return 1;
             } else {
                 return fiboNumber(n - 1) + fiboNumber(n - 2);
             }
         }
         public static boolean isGoldenTriangle ( int a, int b, int c){
             boolean is = ((a + b > c) && (a + c > b) && (b + c > a));
             return is;
         }
}
