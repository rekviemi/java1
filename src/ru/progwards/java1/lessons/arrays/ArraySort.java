package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static int sort(int[] a){
       if (a[1] > a[2]) {
           return a[2] = a[1];
       }
        return 0;
    }



    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 1};

    }
}


//    int[] arrayInt = {-7, 5, 0, 58, -1};
//
//        System.out.println("Массив до сортировки: " + Arrays.toString(arrayInt));
//
//                Arrays.sort(arrayInt);
//
//                System.out.println("Массив после сортировки: " + Arrays.toString(arrayInt));