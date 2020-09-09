package ru.progwards.java1.lessons.basics;


    public class Astronomy{
        public static void main(String[] args) {
            double s1 = earthSquare();
            System.out.println( + s1);

            double s2 = mercurySquare();
            System.out.println( + s2);

            double s3 = jupiterSquare();
            System.out.println( + s3);

            double s4 = earthVsMercury();
            System.out.println( + s4);

            double s5 = earthVsJupiter();
            System.out.println( + s5);
        }

        public static Double sphereSquare(Double r){
            double s = (4 * 3.14) * (r * r);
            return s;
        }

        public static Double earthSquare(){
            double s1 = sphereSquare(6371.2);
            return s1;
        }

        public static Double mercurySquare(){
            double s2 = sphereSquare(2439.7);
            return s2;
        }

        public static Double jupiterSquare(){
            double s3 = sphereSquare(71492.00);
            return s3;
        }
        public static Double earthVsMercury(){
            double s1 = sphereSquare(6371.2);
            double s2 = sphereSquare(2439.7);
            double S = s1 / s2;
            return S;
        }

        public static Double earthVsJupiter(){
            double s1 = sphereSquare(6371.2);
            double s2 = sphereSquare(71492.00);
            double S = s1 / s2;
            return S;
        }
    }
