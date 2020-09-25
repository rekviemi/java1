package ru.rekvi.sas;

public class Test {
    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
    }
    public static int fiboNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } for (int i=3; i <= n; i ++){
            n = (n-1) + (n-2);
        }
        System.out.println(n);
        return n;


        }
    }
//
//    public static double volumeBallDouble(double radius){
//        double v = 4/3.03.14(radiusradiusradius);
//        return v;
//    }
//    public static float volumeBallFloat(float radius){
//        float v1 = 4/3.0f3.14f((float)radius(float)radius(float)radius);
//        return v1;
//    }
//    public static double calculateAccuracy(double radius){
//        return volumeBallDouble ((float)radius) - volumeBallFloat((float) radius);
//    }
//
//    public static void main(String[] args) {
//        volumeBallDouble(6371.2);
//        volumeBallFloat(6371.2f);
//        System.out.println(volumeBallDouble (6371.2) - volumeBallFloat(6371.2f));
//
//    }
