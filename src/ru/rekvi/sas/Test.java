package ru.rekvi.sas;

import java.util.Arrays;

class Test {


    public static void main(String[] args) {
        int length = args.length;
        for (int i = 2; i < 10; i = i + 2) {
            System.out.println("чётные" + " " + i);
        }
        for (int j = 1; j < 10; j = j + 2) {
            System.out.println("а так нечётные" + " " + j);
        }
        for (int w = 1; w < args.length; w++) {
            System.out.println(w);
        }
        for (int q = 5; q > 0; q--) {
            System.out.println(q);
        }
        int[][] array = {{0, 1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" & " + " ");
            }
            System.out.println(" & ");
        }
    }
}


//class Test {
//    public static double addTenPercent(int i) {
//        double a = (i * 0.10);
//        return a + i;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addTenPercent(9));
//    }
//}

//class Test{
//    public static void main(String[] args) {
//        int [] simpleArray1 = new int[5];
//        int [] simpleArray2 = {21, 34, 55, 89, 144};
//        int simpleArray3 [] = {144, 34, 55, 89, 21};
//
//        String [] stringArray1 = new String[5];
//        String [] stringArray2 = {"мне", "всё", "понятно"};
//        System.out.println("simpleArray2[2] = " + simpleArray2[2]);
//        boolean testFibo = simpleArray2[2] + simpleArray2[3] == simpleArray2[4];
//        System.out.println("testFibo = " + testFibo );
//    }
//}


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
