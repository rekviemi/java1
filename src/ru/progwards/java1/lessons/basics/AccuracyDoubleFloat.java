package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.1));
        System.out.println(volumeBallFloat(6371.1F));

    }

    public static double volumeBallDouble(double radius){
    double a = 4.00 / 3 * 3.14 * (6371.1 * 6371.1 * 6371.1);
    return a;
    }

    public static float volumeBallFloat(float radius){
    float t =  4F / 3F * 3.14F * (6371.1F * 6371.1F * 6371.1F);
    return t;
    }

   public static double calculateAccuracy(double radius){
        double d = (float) radius;
        double s = volumeBallDouble(6371.1);
        float s1 = volumeBallFloat(6371.1F);
       double s2 = s / s1;
        return s2;
   }
}
