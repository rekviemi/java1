package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n){
//        lastFibo = new CacheInfo();
//        if (lastFibo.n == n)
//            return lastFibo.fibo;
//
//        int sum = 1;
//        int sum1 = 0;
//        int sum2 = 1;
//        for (int i = 1; i < n; ++i) {
//            sum = sum1 + sum2;
//            sum1 = sum2;
//            sum2 = sum;
//        }
//        return sum;

        lastFibo = new CacheInfo();
        if (lastFibo.n == n)
            return lastFibo.fibo;

        int a = 1;
        int b = 0;
        int c = 0;

        while (c++ < n) {
            int a1 = a;
            a = b;
            b += a1;
        }

        lastFibo.n = n;
        lastFibo.fibo = b;
        return b;

    }
    public static class CacheInfo{
        public int n;
        public int fibo;
    }

    public static CacheInfo getLastFibo(){
       return lastFibo;


    }
    public static Object clearLastFibo(){
        lastFibo = null;
        return null;
    }
    public static void main(String[] args) {
        System.out.println(fiboNumber(1));
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci();
        System.out.println(calculateFibonacci.getLastFibo());
        System.out.println(calculateFibonacci.clearLastFibo());
    }
}
