package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a) {
        int arr;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    arr = a[i];
                    a[i] = a[j];
                    a[j] = arr;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {133, 1, 33, 6, 2, 2147483647, -2147483647};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}


