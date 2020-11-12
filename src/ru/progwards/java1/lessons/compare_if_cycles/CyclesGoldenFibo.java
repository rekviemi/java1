package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {


    public static boolean containsDigit(int number, int digit) {
        boolean contains = number == digit;
        while (number > 0) {
            if (number % 10 == digit)
                return true;
            number = number / 10;
        }
        return contains;
    }


    //         public static int fiboNumber ( int n){
//             if (n == 0) {
//                 return 0;
//             } else if (n == 1) {
//                 return 1;
//             } else {
//                 return fiboNumber(n - 1) + fiboNumber(n - 2);
//             }
//         }
    public static int fiboNumber(int n) {
        int sum = 1;
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 1; i < n; ++i) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;

    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a == b && (double) a / c >= 1.61703d && (double) a / c <= 1.61903) {
            return true;
        }
        if (a == c && (double) a / b >= 1.61703d && (double) a / b <= 1.61903) {
            return true;
        }
        if (b == c && (double) b / a >= 1.61703d && (double) b / a <= 1.61903) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(containsDigit(0, 1));//0 false 1 true && 00 true
        System.out.println(isGoldenTriangle(34, 55, 55)); //34 34 55 false 34 55 55 true
    }
}
