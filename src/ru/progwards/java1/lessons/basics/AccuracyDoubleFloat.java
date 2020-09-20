package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.1));
        System.out.println(volumeBallFloat(6371.1F));
        System.out.println(calculateAccuracy(6371.1));

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
       double a = volumeBallDouble( 6371.1);
       float b = (float) a;
       float c = volumeBallFloat(6371.1F);
       double d = a / c;
      return d;


   }
}
