package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n){
        int sum = 1;
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 1; i < n; ++i) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;
       // if(n == n)
    }
    public static class CacheInfo{
        public int n;
        public int fibo;
    }
    public static CacheInfo getLastFibo(){
        return lastFibo;
    }
    public static void clearLastFibo(){
        lastFibo = null;
    }
    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        clearLastFibo();
    }
}
