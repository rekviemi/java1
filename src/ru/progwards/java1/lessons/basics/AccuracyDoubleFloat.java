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
       double d = a - c;
      return d;


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