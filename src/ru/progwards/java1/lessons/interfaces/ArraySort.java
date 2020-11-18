package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class ArraySort implements CompareWeight {
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }

    public static void sort(CompareWeight[] a) {
        CompareWeight arr;
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.GREATER) {
                    arr = a[i];
                    a[i] = a[j];
                    a[j] = arr;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {133, 1, 33, 6, 2, 2147483647, -2147483647};
       // sort(a);
        System.out.println(Arrays.toString(a));
    }
}
