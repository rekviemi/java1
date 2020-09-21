package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(1, 2, 3));
        System.out.println(minSide(1, 2, 3));
        System.out.println(isEquilateralTriangle(1, 2, 3));
    }

    public static int maxSide(int a, int b, int c) {
        int side;
        if (a > b && a > c) {
            side = a;
        } else if (c < b && c < a) {
            side = c;
        } else if (b > a && b > c) {
            side = b;
        } else if (c > b && c > a) {
            side = c;
        } else {
            side = 0;
        }
        return side;
    }

    public static int minSide(int a, int b, int c){

        int side;
        if (a < b && a < c) {
            side = a;
        } else if (c > b && c > a) {
            side = c;
        } else if (b < a && b < c) {
            side = b;
        } else if (c < b && c < a) {
            side = c;
        } else {
            side = 0;
        }
        return side;
        }
    public static boolean isEquilateralTriangle(int a, int b, int c){
boolean result = a == b && b == c;
return result;
    }
}