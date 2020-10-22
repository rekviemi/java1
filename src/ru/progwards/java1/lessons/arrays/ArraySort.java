package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    int arr;

    public static void sort(int[] a){
        int arr;
        for (int f = 0; f < a.length; f++){
            for (int i = f + 1; i < a.length; i++){
                if (a [f] > a [i]){
                    arr = a [f];
                    a [f] = a [i];
                    a [i] = arr;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a = {2,4,3,6,5,7,5,8,1,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}


//    int[] arrayInt = {-7, 5, 0, 58, -1};
//
//        System.out.println("Массив до сортировки: " + Arrays.toString(arrayInt));
//
//                Arrays.sort(arrayInt);
//
//                System.out.println("Массив после сортировки: " + Arrays.toString(arrayInt));