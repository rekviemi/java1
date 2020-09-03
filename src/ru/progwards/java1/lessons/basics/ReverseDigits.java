package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number){
        System.out.println(number % 10);
        return (number/10 > 0) ? reverseDigits(number/10) : number;
    }

}
