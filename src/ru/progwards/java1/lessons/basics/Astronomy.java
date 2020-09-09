package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {
        double s1 = earthSquare();
        System.out.println( + s1);

        double s2 = mercurySquare();
        System.out.println( + s2);

        double s3 = jupiterSquare();
        System.out.println( + s3);
    }

    public static Double sphereSquare(Double r){
        double s = (4 * 3.14) * (r * r);
        return s;
    }

    public static Double earthSquare(){
        double r = 6371.2;
        double s1 = (4 * 3.14) * (r * r);
        return s1;
    }

   public static Double mercurySquare(){
       double r = 2439.7;
       double s2 = (4 * 3.14) * (r * r);
       return s2;
   }

   public static Double jupiterSquare(){
       double r = 71492.00;
       double s3 = (4 * 3.14) * (r * r);
       return s3;
   }
    public static Double earthVsMercury(){
        double r = 1;
        return r;
    }

    public static Double earthVsJupiter(){
        double r = 1;
        return r;
    }
}
