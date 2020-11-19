package ru.progwards.java1.lessons.interfaces;


public class ArraySort  {

    public static void sort(CompareWeight[] a) {
        CompareWeight arr;
        for (int i = 0; i < a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.GREATER) {
                    arr = a[i];
                    a[i] = a[j];
                    a[j] = arr;
                }
            }
        }
    }
}
