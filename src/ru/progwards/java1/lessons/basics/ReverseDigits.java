package ru.progwards.java1.lessons.basics;

class ReverseDigits {
    public static void main(String[] args){
        System.out.println(reverseDigits(123));
    }
        public static int reverseDigits( int number){
            int a = number / 100;
            int b = number / 10 % 10;
            int c = number % 10;
            return (c * 100) + (b * 10) + a;
        }
    }
