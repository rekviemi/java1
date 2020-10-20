package ru.rekvi.sas;

import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] max = new int[]{1,2,3};
        System.out.println(arrayMax(max));

    }

    public static int arrayMax(int[] a){
        if (a.length == 0)
            return 0;
        Arrays.sort(a);
        int  max = 0;
        max = a[a.length -1];
        return max;

    }
}



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
