package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(3, 4, 5));
        System.out.println(minSide(9, 10, 9));
        System.out.println(isEquilateralTriangle(1, 2, 3));
    }

    public static int maxSide(int a, int b, int c) {
       int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else if  (c >= b && c >= a){
            max = c;
        } else {
            max = 0;
        }
        return max;
    }
//        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//        return max;

    public static int minSide(int a, int b, int c) {

        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else if (c <= b && c <= a) {
            min = c;
        } else {
            min = 0;
        }
        return min;
        }
//        min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
//        return min;



    public static boolean isEquilateralTriangle(int a, int b, int c){
boolean result = a == b && b == c;
return result;
    }
}