package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    public enum CompareResult{
            LESS,
            EQUAL,
            GREATER;
    }
    public CompareResult compareWeight(CompareWeight smthHasWeigt);

    public static void sort(CompareWeight[] a){
        int arr;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    arr = a[i];
//                    a[i] = a[j];
//                    a[j] = arr;
//                }
            }
        }
    }

}
