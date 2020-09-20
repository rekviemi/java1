package ru.rekvi.sas;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i <= 19; i++)
            System.out.println(factorial(i));
    }
    static long factorial(long n){

        if( n <= 1 )
            return 1;

        else
            return n * factorial( n - 1 );


    }
}
